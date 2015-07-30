import groovy.text.GStringTemplateEngine

def setEnvCmd = new File("$seuHome/software/set-env.cmd")
def binding = [ seuHome : seuHome ]
def binding = [ seuLayout : seuLayout ]
def engine = new GStringTemplateEngine()

def template = engine.createTemplate(setEnvCmd).make(binding)
setEnvCmd.write(template.toString())