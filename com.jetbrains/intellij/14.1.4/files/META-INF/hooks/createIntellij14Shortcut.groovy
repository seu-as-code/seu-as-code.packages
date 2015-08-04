import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
	def shortcut = wshShell.CreateShortcut("$seuHome\\intellij14.lnk")
	shortcut.TargetPath = "$seuHome\\software\\start-intellij-14.1.4.bat"
	shortcut.IconLocation = "$seuHome\\software\\intellij-14.1.4\\bin\\idea64.exe, 0"
	shortcut.WorkingDirectory = "$seuHome\\software"
	shortcut.Save()
}