
export GROOVY_HOME=$SOFTWARE_DIR/groovy-2.4.7
export JAVA_OPTS="$JAVA_OPTS -Dgrape.config=$GROOVY_HOME/conf/grapeConfig.xml -Dgroovy.root=$GROOVY_HOME/.groovy/"
export PATH=$GROOVY_HOME/bin:$PATH
