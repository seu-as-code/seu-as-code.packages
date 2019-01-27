#!/usr/bin/env bash

source $(dirname $0)/set-env.sh

cd $DERBY_HOME

./bin/setNetworkServerCP
./bin/startNetworkServer
