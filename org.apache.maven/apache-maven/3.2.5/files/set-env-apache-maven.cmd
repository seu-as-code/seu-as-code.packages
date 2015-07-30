@echo off

set MAVEN_HOME=%SOFTWARE_DIR%\apache-maven-3.2.5
set MAVEN_OPTS=-Xmx4096M -Xms512M -XX:MaxPermSize=512M -Dfile.encoding=UTF-8

set M3_HOME=%MAVEN_HOME%
set M3_REPO=%SEU_HOME%\repository

set PATH=%M3_HOME%\bin;%PATH%
