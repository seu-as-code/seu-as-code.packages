@echo off

set MAVEN_HOME=%SOFTWARE_DIR%\apache-maven-3.6.1

set MAVEN_OPTS=-Xmx4096M -Xms512M -Dfile.encoding=UTF-8

set M3_HOME=%MAVEN_HOME%

set PATH=%M3_HOME%\bin;%PATH%
