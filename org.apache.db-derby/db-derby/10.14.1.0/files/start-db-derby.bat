@echo off
call ./set-env.cmd

cd %DERBY_HOME%
call bin\setNetworkServerCP.bat
call bin\startNetworkServer.bat
