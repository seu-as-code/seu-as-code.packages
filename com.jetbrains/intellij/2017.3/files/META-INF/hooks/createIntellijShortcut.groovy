import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
	def shortcut = wshShell.CreateShortcut("$seuHome\\intellij.lnk")
	shortcut.TargetPath = "${seuLayout.software}\\start-intellij.bat"
	shortcut.IconLocation = "${seuLayout.software}\\intellij-2017.3.4\\bin\\idea64.exe, 0"
	shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}
