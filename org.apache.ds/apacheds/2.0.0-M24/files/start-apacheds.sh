#!/usr/bin/env bash

source $(dirname $0)/set-env.sh

cd $APACHE_DS_HOME/bin

./apacheds.sh $1
