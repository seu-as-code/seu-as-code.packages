import org.codehaus.groovy.scriptom.*
import de.qaware.seu.as.code.plugins.base.Platform

if (Platform.current() == Platform.Windows) {
	Scriptom.inApartment
	{
			def wshShell = new ActiveXObject("WScript.Shell")
	    def shortcut = wshShell.CreateShortcut("$seuHome\\console.lnk")
	    shortcut.TargetPath = "${seuLayout.software}\\start-console.bat"
	    shortcut.WorkingDirectory = "${seuLayout.software}"
			shortcut.Save()
	}
} else {
	Path link = Paths.get("$seuHome/Console")
	Path target = Paths.get("${seuLayout.software}/start-console")
	try {
		Files.createSymbolicLink(link, target)
	} catch (all) {
		logger.warn(all)
	}
}
