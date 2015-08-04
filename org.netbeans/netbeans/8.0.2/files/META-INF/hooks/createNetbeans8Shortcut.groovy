import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
	def shortcut = wshShell.CreateShortcut("$seuHome\\Netbeans8.lnk")
	shortcut.TargetPath = "${seuLayout.software}\\start-netbeans-8.0.2.bat"
	shortcut.IconLocation = "${seuLayout.software}\\netbeans-8.0.2\\bin\\netbeans64.exe, 0"
	shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}
