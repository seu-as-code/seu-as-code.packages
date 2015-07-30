import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\tomcat8.lnk")
    shortcut.TargetPath = "$target\\start-tomcat8.bat"	
	shortcut.IconLocation = "$target\\apache-tomcat-8.0.24\\bin\\tomcat8.ico, 0"
    shortcut.WorkingDirectory = "$target"
	shortcut.Save()
}