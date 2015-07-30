# SEU-as-Code Packages

This repository contains individual Gradle projects to build and publish customized software packages 
ready to be used as dependencies in a SEU-as-Code based project.

## Building
Each software package needs to be build individually, no multi-project.
```groovy
gradlew clean buildPackage
```
