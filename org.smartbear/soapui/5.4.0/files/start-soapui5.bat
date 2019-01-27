@echo off
call ./set-env.cmd

if not "%JAVA_HOME%" == "" goto SET_CLASSPATH

echo JAVA_HOME is not set, unexpected results may occur.
echo Set JAVA_HOME to the directory of your local JDK to avoid this message.

:SET_CLASSPATH

rem init classpath

set CLASSPATH=%SOAPUI_HOME%soapui-5.4.0.jar;%SOAPUI_HOME%..\lib\*
"%JAVA%" -cp "%CLASSPATH%" com.eviware.soapui.tools.JfxrtLocator > %TEMP%\jfxrtpath
set /P JFXRTPATH= < %TEMP%\jfxrtpath
del %TEMP%\jfxrtpath
set CLASSPATH=%CLASSPATH%;%JFXRTPATH%

rem JVM parameters, modify as appropriate

set JAVA_OPTS=-Xms128m -Xmx1024m -Dsoapui.properties=soapui.properties "-Dsoapui.home=%SOAPUI_HOME%\" -splash:soapui-splash.png

if "%SOAPUI_HOME%" == "" goto START
    set JAVA_OPTS=%JAVA_OPTS% -Dsoapui.ext.libraries="%SOAPUI_HOME%ext"
    set JAVA_OPTS=%JAVA_OPTS% -Dsoapui.ext.listeners="%SOAPUI_HOME%listeners"
    set JAVA_OPTS=%JAVA_OPTS% -Dsoapui.ext.actions="%SOAPUI_HOME%actions"
	set JAVA_OPTS=%JAVA_OPTS% -Djava.library.path="%SOAPUI_HOME%\"
	set JAVA_OPTS=%JAVA_OPTS% -Dwsi.dir="%SOAPUI_HOME%..\wsi-test-tools"
rem uncomment to disable browser component
rem    set JAVA_OPTS=%JAVA_OPTS% -Dsoapui.browser.disabled="true"
:START

rem ********* run soapui ***********

start "" "%JAVA%" %JAVA_OPTS% -cp "%CLASSPATH%" com.eviware.soapui.SoapUI %*