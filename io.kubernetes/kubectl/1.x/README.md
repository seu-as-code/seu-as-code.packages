# Kubectl 1.x

The package contains the Kubectl 1.6.4 executable. Install this SEU-as-code
package using one of the following dependency:

```groovy
dependencies {
  // for Windows platforms
	software 'io.kubernetes:kubectl:1.6.4:win'

  // for Unix and Linux platforms
  software 'io.kubernetes:kubectl:1.6.4:unix'

	// for MacOS platforms
	software 'io.kubernetes:kubectl:1.6.4:mac'

	// alternatively using Brew
	brew ':kubectl:'
}
```
