#!/usr/bin/env bash

./gradlew clean bootRepackage

java -jar build/libs/peopleconnect-1.0-SNAPSHOT.jar