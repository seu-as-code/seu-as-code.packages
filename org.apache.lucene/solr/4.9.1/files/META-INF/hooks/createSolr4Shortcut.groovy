import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\Solr4.lnk")
    shortcut.TargetPath = "${seuLayout.software}\\start-solr4.bat"	
    shortcut.WorkingDirectory = "${seuLayout.software}"
	shortcut.Save()
}