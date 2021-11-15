#!/usr/bin/env bash
cd "$(dirname "$0")" || exit
java -jar tic-tac-toe1-1.0-SNAPSHOT.jar
echo "Press enter to continue"
read -r test