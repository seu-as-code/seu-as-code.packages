import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
	def shortcut = wshShell.CreateShortcut("$seuHome\\intellij2016.lnk")
	shortcut.TargetPath = "${seuLayout.software}\\start-intellij-2016.1.2b.bat"
	shortcut.IconLocation = "${seuLayout.software}\\intellij-2016.1.2b\\bin\\idea64.exe, 0"
	shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}
