#!/bin/bash

killall -9 java
nohup java -jar /dados/deploy/cicd-peta-0.0.1-SNAPSHOT.jar &