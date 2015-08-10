@echo off
call ./set-env.cmd

cd %SOLR4_HOME%\example
java %SOLR_OPTS% -jar start.jar