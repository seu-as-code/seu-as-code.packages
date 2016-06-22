# Glassfish v4.1

The package contains the Glassfish Application Server v4.1 release. See [glassfish.java.net](https://glassfish.java.net/) for more details.
Install this package using SEU-as-code using the following dependency:
```groovy
dependencies {
	// this is the full platform release
	software 'net.java:glassfish4:4.1'

	// the is the web profile release
	software 'net.java:glassfish4:4.1:web'
}
```

## Prerequisites
Java EE 7 requires JDK 7 Update 65 or above, JDK 8 u20 or above is recommended
for GlassFish 4.1.
```groovy
dependencies {
	software 'net.java:openjdk8:8u40'
}
```

## Basic Usage
Please refer to the [Glassfish Quick Start Guide](https://glassfish.java.net/docs/4.0/quick-start-guide.pdf).
