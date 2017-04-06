#!/usr/bin/env bash

./set-env-db-derby.sh

cd $DERBY_HOME

./bin/setNetworkServerCP
./bin/startNetworkServer
