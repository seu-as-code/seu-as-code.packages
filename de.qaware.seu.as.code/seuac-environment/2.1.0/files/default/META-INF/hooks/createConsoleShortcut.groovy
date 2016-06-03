import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\console.lnk")
    shortcut.TargetPath = "${seuLayout.software}\\start-console.bat"
    shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}