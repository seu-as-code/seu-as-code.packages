import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
    def start = wshShell.CreateShortcut("$seuHome\\Start-Solr5.lnk")
    start.TargetPath = "$seuHome\\software\\start-solr5.bat"	
    start.WorkingDirectory = "$seuHome\\software"
	start.Save()
	
	def stop = wshShell.CreateShortcut("$seuHome\\Stop-Solr5.lnk")
    stop.TargetPath = "$seuHome\\software\\stop-solr5.bat"	
    stop.WorkingDirectory = "$seuHome\\software"
	stop.Save()
}