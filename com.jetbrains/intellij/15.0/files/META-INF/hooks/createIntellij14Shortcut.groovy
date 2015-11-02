import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
	def shortcut = wshShell.CreateShortcut("$seuHome\\intellij15.lnk")
	shortcut.TargetPath = "$seuHome\\software\\start-intellij-15.0.bat"
	shortcut.IconLocation = "$seuHome\\software\\intellij-15.0\\bin\\idea64.exe, 0"
	shortcut.WorkingDirectory = "$seuHome\\software"
	shortcut.Save()
}
