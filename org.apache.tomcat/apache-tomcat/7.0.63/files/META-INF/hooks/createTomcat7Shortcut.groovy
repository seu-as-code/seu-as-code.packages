import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\tomcat7.lnk")
    shortcut.TargetPath = "$target\\start-tomcat7.bat"	
	shortcut.IconLocation = "$target\\apache-tomcat-7.0.63\\bin\\tomcat7.ico, 0"
    shortcut.WorkingDirectory = "$target"
	shortcut.Save()
}