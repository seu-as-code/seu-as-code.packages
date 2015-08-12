import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\ConEmu.lnk")
    shortcut.TargetPath = "${seuLayout.software}\\start-conemu.bat"
    shortcut.IconLocation = "${seuLayout.software}\\ConEmuPack.150705\\ConEmu64.exe"
    shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}