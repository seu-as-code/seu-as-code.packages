# JRuby 1.7.21

The package contains the JRuby 1.7.21 release. Install this SEU-as-Code package using the following dependency:
```groovy
dependencies {
	software 'org.jruby:jruby:1.7.21'
}
```

**WARNING**: currently JRuby seems to have a problem with UTF-8 encoding. So make sure you do not have the file 
encoding system property set: `JAVA_OPTS=-Dfile.encoding=UTF-8`