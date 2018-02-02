import groovy.text.GStringTemplateEngine

def engine = new GStringTemplateEngine()
def binding = [ seuHome : seuHome, seuLayout : seuLayout, projectName : projectName ]

def setEnvCmd = new File("${seuLayout.software}/set-env.cmd")
if (setEnvCmd.exists()) {
   def template = engine.createTemplate(setEnvCmd).make(binding)
   setEnvCmd.write(template.toString())
}

def setEnvSh = new File("${seuLayout.software}/set-env.sh")
if (setEnvSh.exists()) {
   def template = engine.createTemplate(setEnvSh).make(binding)
   setEnvSh.write(template.toString())
   setEnvSh.setExecutable(true)
}
