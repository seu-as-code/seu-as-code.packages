#!/usr/bin/env bash
clear
cat \$(dirname \$0)/ascii-art.txt

export PROJECT_NAME=$projectName
export SEU_HOME=$seuHome
export SOFTWARE_DIR=$seuLayout.software
export HOME=$seuLayout.home
export CODEBASE=$seuLayout.codebase
export DOCBASE=$seuLayout.docbase

for f in \$(dirname \$0)/set-env-*.sh ; do
  . \$f
done

# currently defaults to JDK8
export JAVA_HOME=\$JAVA8_HOME
export JAVA_OPTS="\$JAVA_OPTS -Xmx4096M -Xms512M -Dfile.encoding=UTF-8"

export IDEA_JDK_64=\$JAVA_HOME
export IDEA_JDK=\$JAVA_HOME
export JDK_HOME=\$JAVA_HOME
export JRE_HOME=\$JAVA_HOME/jre

export M2_HOME=\$MAVEN_HOME
export M3_HOME=\$MAVEN_HOME
export M2_REPO=$seuLayout.repository
export M3_REPO=$seuLayout.repository

export PATH=\$JAVA_HOME/bin:\$PATH
