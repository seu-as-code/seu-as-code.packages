#!/usr/bin/env bash

source $(dirname $0)/set-env.sh

cd $SOLR6_HOME

./bin/solr start -f