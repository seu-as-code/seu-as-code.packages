def groovyRootDir = new File("${seuLayout.software}/groovy-2.4.4/.groovy/")
try {
	groovyRootDir.mkdirs()
} catch (IOException ioe) {
	logger.warn('Error creating Groovy root directory.', ioe)
}