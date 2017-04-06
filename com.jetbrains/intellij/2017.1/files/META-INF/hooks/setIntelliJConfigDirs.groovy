import groovy.text.GStringTemplateEngine

def binding = [seuHome: seuHome]
def engine = new GStringTemplateEngine()

def asenv = new File("${seuLayout.software}/IntelliJ IDEA.app/Contents/bin/idea.properties")
def template = engine.createTemplate(asenv).make(binding)
asenv.write(template.toString())
