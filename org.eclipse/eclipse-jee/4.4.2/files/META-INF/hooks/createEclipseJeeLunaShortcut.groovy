import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
	def shortcut = wshShell.CreateShortcut("$seuHome\\eclipse-jee-luna.lnk")
	shortcut.TargetPath = "${seuLayout.software}\\start-eclipse-jee-luna.bat"
	shortcut.IconLocation = "${seuLayout.software}\\eclipse-jee-luna\\eclipse.exe, 0"
	shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}
