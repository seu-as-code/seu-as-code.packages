@echo off

set DERBY_HOME=%SOFTWARE_DIR%\db-derby-10.14.1.0
set PATH=%DERBY_HOME%\bin;%PATH%
:: use default file permissions
set DERBY_OPTS=-Dderby.storage.useDefaultFilePermissions=true