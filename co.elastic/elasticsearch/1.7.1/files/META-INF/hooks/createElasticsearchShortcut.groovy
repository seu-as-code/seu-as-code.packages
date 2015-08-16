import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom


Scriptom.inApartment {
    def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\Elasticsearch.lnk")
    shortcut.TargetPath = "$seuHome\\software\\elasticsearch-1.7.1\\bin\\elasticsearch.bat"
    shortcut.WorkingDirectory = "$seuHome\\software"
    shortcut.Save()
}