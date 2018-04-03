#!/bin/bash
#
# Use this shell script to compile (if necessary) your code and then execute it. Below is an example of what might be found in this file if your program was written in Python
#
#python ./src/sessionization.py ./input/log.csv ./input/inactivity_period.txt ./output/sessionization.txt

echo "Cleaning up from previous runs"

./mvnw clean

if [ -d src/main/resources ]
then
    rm -rf src/main/resources
    ln -s ./input src/main/resources
fi

echo "Compiling the project"
./mvnw compile

echo "Running the project"
./mvnw exec:java -Dexec.args="./input/log.csv ./input/inactivity_period.txt ./output/sessionization.txt"