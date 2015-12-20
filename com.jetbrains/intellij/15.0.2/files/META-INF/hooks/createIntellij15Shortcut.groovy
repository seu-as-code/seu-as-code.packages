import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
	def shortcut = wshShell.CreateShortcut("$seuHome\\intellij15.lnk")
	shortcut.TargetPath = "${seuLayout.software}\\start-intellij-15.0.2.bat"
	shortcut.IconLocation = "${seuLayout.software}\\intellij-15.0.2\\bin\\idea64.exe, 0"
	shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}
