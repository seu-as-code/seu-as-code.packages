@echo off
call ./set-env.cmd

cd %SOFTWARE_DIR%\apache-tomcat-8.0.24\bin
start startup.bat
