#!/bin/bash

# Use this script to start integration testing infrastructure the same way the CI/CD server does.
# You will have to use docker port ${containerName} ${containerPort}/tcp to get the host-side ports

docker-compose --file build/docker/docker-compose.yml up -d --no-recreate