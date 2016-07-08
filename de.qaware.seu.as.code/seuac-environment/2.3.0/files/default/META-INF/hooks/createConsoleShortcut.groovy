import org.codehaus.groovy.scriptom.*
import java.nio.file.*

if (System.getProperty("os.name").toLowerCase().contains("windows")) {
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
