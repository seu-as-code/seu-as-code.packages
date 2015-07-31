[![Stories in Ready](https://badge.waffle.io/seu-as-code/seu-as-code.packages.png?label=ready&title=Ready)](https://waffle.io/seu-as-code/seu-as-code.packages)
[![Stories in Progress](https://badge.waffle.io/seu-as-code/seu-as-code.packages.png?label=in%20progress&title=In%20Progress)](https://waffle.io/seu-as-code/seu-as-code.packages)
[![Apache License 2](http://img.shields.io/badge/license-ASF2-blue.svg)](https://github.com/seu-as-code/seu-as-code.packages/blob/master/LICENSE)
[![Join on Chat](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/seu-as-code/seu-as-code?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

# SEU-as-Code Packages

This repository contains individual Gradle projects to build and publish customized software packages 
ready to be used as dependencies in a SEU-as-Code based project.

## Building
Each software package needs to be build individually, no multi-project.
```groovy
gradlew clean buildPackage
```

## Maintainer

M.-Leander Reimer (@lreimer)
