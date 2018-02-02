import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.attribute.PosixFilePermissions

Files.createSymbolicLink(Paths.get("${seuHome}/KeePassXC.app"),
	Paths.get("${seuLayout.software}/KeePassXC.app"))
