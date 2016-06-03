import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
	def shortcut = wshShell.CreateShortcut("$seuHome\\eclipse-rcp-mars.lnk")
	shortcut.TargetPath = "${seuLayout.software}\\start-eclipse-rcp-mars.bat"
	shortcut.IconLocation = "${seuLayout.software}\\eclipse-rcp-mars\\eclipse.exe, 0"
	shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}
