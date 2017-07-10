# SEU-as-code Environment 2.4.0

The package contains the SEU-as-code Environment 2.4.0 release. From this version
on this package offers support for Windows and Mac OSX. Install this SEU-as-code
package using one of the following dependency:

```groovy
dependencies {
	// to use the system JAVA_HOME environment
	software 'de.qaware.seu.as.code:seuac-environment:2.4.0'

	// platform specific version of the packages (since Base Plugin 2.3.0)
	// software "de.qaware.seu.as.code:seuac-environment:2.4.0:$osClassifier"

	// to be used together with a JDK7 SEU-as-code package
	// expects an environment variable name JAVA7_HOME
	// software 'de.qaware.seu.as.code:seuac-environment:2.4.0:jdk7'

	// to be used together with a JDK8 SEU-as-code package
	// expects an environment variable name JAVA8_HOME
	// software 'de.qaware.seu.as.code:seuac-environment:2.4.0:jdk8'
}
```
