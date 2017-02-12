# Payara Server 4.1.1.164

The package contains the Payara Server 4.1.1.164 release. See [http://www.payara.fish/](http://www.payara.fish/) for more details.
Install this package using SEU-as-code with the following dependency:
```groovy
dependencies {
	// this is the full platform release
	software 'fish.payara:payara:4.1.1.164'

	// the is the web profile release
	software 'fish.payara:payara:4.1.1.164:web'
}
```

## Prerequisites
Java EE 7 requires JDK 7 Update 65 or above, JDK 8u20 or above is recommended
for Payara Server 4.1.1.164.
```groovy
dependencies {
	software 'net.java:openjdk8:8u40'
}
```
