@echo off
type ascii-art.txt

set PROJECT_NAME=$projectName
set SEU_HOME=$seuHome
set SOFTWARE_DIR=$seuLayout.software
set HOME=$seuLayout.home
set CODEBASE=$seuLayout.codebase
set DOCBASE=$seuLayout.docbase

:: load software settings
for %%f in (%SOFTWARE_DIR%\\set-env-*.cmd) do call %%f

:: currently defaults to JDK9
set JAVA_HOME=%JAVA9_HOME%
set JAVA_OPTS=%JAVA_OPTS% -Xmx4096M -Xms512M -Dfile.encoding=UTF-8

set IDEA_JDK_64=%JAVA_HOME%
set IDEA_JDK=%JAVA_HOME%
set JDK_HOME=%JAVA_HOME%
set JRE_HOME=%JAVA_HOME%\\jre

set M2_HOME=%MAVEN_HOME%
set M3_HOME=%MAVEN_HOME%
set M2_REPO=$seuLayout.repository
set M3_REPO=$seuLayout.repository

set PATH=%JAVA_HOME%\\bin;%PATH%
