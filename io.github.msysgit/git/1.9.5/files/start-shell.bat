@echo off
call ./set-env.cmd

@set PLINK_PROTOCOL=ssh
@if not defined TERM set TERM=msys

@cd /d %HOME%
call git-bash.bat