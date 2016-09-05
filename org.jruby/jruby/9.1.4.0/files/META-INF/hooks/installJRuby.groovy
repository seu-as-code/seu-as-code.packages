import groovy.text.GStringTemplateEngine

def jRubyBin = new File("${seuLayout.software}/jruby-9.1.4.0/bin/")

File jruby = new File(jRubyBin, "jruby")
jruby.setExecutable(true)

File gem = new File(jRubyBin, "gem")
gem.setExecutable(true)

File rake = new File(jRubyBin, "rake")
rake.setExecutable(true)

File rdoc = new File(jRubyBin, "rdoc")
rdoc.setExecutable(true)
