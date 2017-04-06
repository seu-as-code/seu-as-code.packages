import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\shell.lnk")
    shortcut.TargetPath = "${seuLayout.software}\\start-shell.bat"
    shortcut.IconLocation = "${seuLayout.software}\\git-2.11.1\\usr\\share\\git\\git-for-windows.ico"
    shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}