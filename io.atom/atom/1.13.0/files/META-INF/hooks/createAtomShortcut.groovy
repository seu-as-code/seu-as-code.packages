import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
    def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\atom.lnk")
    shortcut.TargetPath = "${seuLayout.software}\\start-atom.bat"
    shortcut.IconLocation = "${seuLayout.software}\\atom-1.13.0\\atom.exe"
    shortcut.WorkingDirectory = "${seuLayout.software}"
	  shortcut.Save()
}
