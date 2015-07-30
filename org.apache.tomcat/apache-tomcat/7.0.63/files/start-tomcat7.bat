@echo off
call ./set-env.cmd

cd %SOFTWARE_DIR%\apache-tomcat-7.0.63\bin
start startup.bat
