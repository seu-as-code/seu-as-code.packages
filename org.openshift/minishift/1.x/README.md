# Minishift 1.3.0

The package contains the Minishift 1.3.0 executable. Install this SEU-as-code
package using one of the following dependency:

```groovy
dependencies {
  // for Windows platforms
	software 'org.openshift:minishift:1.3.0:win'

  // for Unix and Linux platforms
  software 'org.openshift:minishift:1.3.0:unix'

	// for MacOS platforms
	software 'org.openshift:minishift:1.3.0:mac'

	// alternatively using Brew
	cask ':minishift:'
}
```
