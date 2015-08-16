import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom

Scriptom.inApartment {
    def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\kibana.lnk")
    shortcut.TargetPath = "$seuHome\\software\\kibana-4.1.1-windows\\bin\\kibana.bat"
    shortcut.WorkingDirectory = "$seuHome\\software"
    shortcut.Save()
}