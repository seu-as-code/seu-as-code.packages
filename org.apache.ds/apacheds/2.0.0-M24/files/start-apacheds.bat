@echo off
call ./set-env.cmd

cd %APACHE_DS_HOME%\bin
call apacheds %1