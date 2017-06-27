import org.codehaus.groovy.scriptom.*
import java.nio.file.*

if (System.getProperty("os.name").toLowerCase().contains("windows")) {
    Scriptom.inApartment
            {
                def wshShell = new ActiveXObject("WScript.Shell")
                def start = wshShell.CreateShortcut("$seuHome\\Solr6.lnk")
                start.TargetPath = "${seuLayout.software}\\start-solr6.bat"
                start.WorkingDirectory = "${seuLayout.software}"
                start.Save()
            }
} else {
    Path link = Paths.get("$seuHome/Solr6")
    Path target = Paths.get("${seuLayout.software}/start-solr6")
    try {
        Files.createSymbolicLink(link, target)
    } catch (all) {
        logger.warn(all)
    }
}