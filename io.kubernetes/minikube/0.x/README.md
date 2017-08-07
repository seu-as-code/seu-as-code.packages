# Minikube 0.x

The package contains the Minikube 0.21.0 executable. Install this SEU-as-code
package using one of the following dependency:

```groovy
dependencies {
  // for Windows platforms
	software 'io.kubernetes:minikube:0.21.0:win'

  // for Unix and Linux platforms
  software 'io.kubernetes:minikube:0.21.0:unix'

	// for MacOS platforms
	software 'io.kubernetes:minikube:0.21.0:mac'

	// alternatively using Brew
	cask ':minikube:'
}
```
