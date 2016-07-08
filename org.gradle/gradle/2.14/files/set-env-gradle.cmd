@echo off

set GRADLE_HOME=%SOFTWARE_DIR%\gradle-2.14
set GRADLE_OPTS=-Xmx4096M -Xms512M -Dfile.encoding=UTF-8

set PATH=%GRADLE_HOME%\bin;%PATH%
