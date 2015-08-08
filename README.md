[![Stories in Ready](https://badge.waffle.io/seu-as-code/seu-as-code.packages.png?label=ready&title=Ready)](https://waffle.io/seu-as-code/seu-as-code.packages)
[![Stories in Progress](https://badge.waffle.io/seu-as-code/seu-as-code.packages.png?label=in%20progress&title=In%20Progress)](https://waffle.io/seu-as-code/seu-as-code.packages)
[![Apache License 2](http://img.shields.io/badge/license-ASF2-blue.svg)](https://github.com/seu-as-code/seu-as-code.packages/blob/master/LICENSE)

# SEU-as-Code Packages

This repository contains individual Gradle projects to build and publish customized software packages 
ready to be used as dependencies in a SEU-as-Code based project.

## Creating

For details on creating and building your own SEU-as-Code packages, please see the [Wiki](https://github.com/seu-as-code/seu-as-code.packages/wiki/Package-Creation-Guide).

## Building

Each software package needs to be build individually, no multi-project.
```groovy
gradlew clean buildPackage
```

## Contributing

Is there anything missing? Do you have ideas for new features or improvements? You are highly welcome to contribute
your improvements, plugins or packages to the SEU-as-Code projects. All you have to do is to fork this repository,
improve the code and issue a pull request. You can also have a look at the [Contributor Guide](https://github.com/seu-as-code/seu-as-code.packages/wiki/Contributor-Guide)

## Maintainer

M.-Leander Reimer (@lreimer)
