import groovy.text.GStringTemplateEngine

def jRubyBin = new File("${seuLayout.software}/jruby-1.7.21/bin/")

File jruby = new File(jRubyBin, "jruby")
jruby.setExecutable(true)

File gem = new File(jRubyBin, "gem")
gem.setExecutable(true)

logger.lifecycle "Installing JRuby Gems ..."

def command = new String[3]
def executable = ""

try {
	// are we in a shell?
	"sh -version".execute()

	// we are in a shell
	command[0] = "sh"
	command[1] = "-c"
	executable = "gem"
} catch (IOException e) {
	// we are in a console
	command[0] = "cmd.exe"
	command[1] = "/C"
	executable = "gem.bat"
}

command[2] = "$executable install bundler".toString()
def bundler = new ProcessBuilder(command).directory(jRubyBin).redirectErrorStream(true).start()
bundler.inputStream.eachLine { logger.lifecycle it }
bundler.waitFor()
