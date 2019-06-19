#!/usr/bin/env bash
mvn clean package

docker build -t 192.168.2.169/demo/goods:latest .

docker push 192.168.2.169/demo/goods:latest