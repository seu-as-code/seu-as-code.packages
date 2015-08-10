import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
	def wshShell = new ActiveXObject("WScript.Shell")
    def start = wshShell.CreateShortcut("$seuHome\\Start-Solr5.lnk")
    start.TargetPath = "${seuLayout.software}\\start-solr5.bat"	
    start.WorkingDirectory = "${seuLayout.software}"
	start.Save()
	
	def stop = wshShell.CreateShortcut("$seuHome\\Stop-Solr5.lnk")
    stop.TargetPath = "${seuLayout.software}\\stop-solr5.bat"	
    stop.WorkingDirectory = "${seuLayout.software}"
	stop.Save()
}