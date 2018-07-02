@echo off
call ./set-env.cmd

@set PLINK_PROTOCOL=ssh
@if not defined TERM set TERM=msys

start "" git-bash.exe --cd-to-home
