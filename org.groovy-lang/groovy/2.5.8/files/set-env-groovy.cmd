@echo off

set GROOVY_HOME=%SOFTWARE_DIR%\groovy-2.5.8
set JAVA_OPTS=%JAVA_OPTS% -Dgrape.config=%GROOVY_HOME%/conf/grapeConfig.xml -Dgroovy.root=%GROOVY_HOME%/.groovy/
set PATH=%GROOVY_HOME%\bin;%PATH%
