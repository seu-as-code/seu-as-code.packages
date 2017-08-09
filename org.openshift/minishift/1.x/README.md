# Minishift 1.x

The package contains the Minishift 1.4.1 executable. Install this SEU-as-code
package using one of the following dependency:

```groovy
dependencies {
  // for Windows platforms
	software 'org.openshift:minishift:1.4.1:win'

  // for Unix and Linux platforms
  software 'org.openshift:minishift:1.4.1:unix'

	// for MacOS platforms
	software 'org.openshift:minishift:1.4.1:mac'

	// alternatively using Brew
	cask ':minishift:'
}
```
