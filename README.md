# Overview
This project is just a learning tool to see how much Spring offers in the way of
Amazon S3 support.

# Guidebook

# Prerequisites

* working [Docker](https://www.docker.com/) installation
* current Linux distribution -- we tested under [Xubuntu](https://xubuntu.org/)

# Building
We have a couple ways to build the product, with the preferred mode being to
build from within a Docker container, greatly simplifying dependency management.

## Build Natively
To build from your native development box. just run `./gradlew`.  This will compile
the source, run the unit tests and assemble the artifact.  This form requires
a Java 8 JDK installed and `JAVA_HOME` properly set in the environment.

## Build Via Docker
To simulate how the CI/CD server builds the project, run `bin/simulate-ci-server.sh`.
In addition to the normal build, the integration tests are also run.

## Integration Testing
When Gradle is instructed to run the integration tests, it will spin up the required
infrastructure as Docker containers via Docker Compose.  This greatly simplifies
the requirements on the CI/CD machine and also allows for concurrent builds that
avoid collisions.

To ensure that each build has access to its own dedicated set of resources, a naming
convention is applied dynamically to each resource.  These names are used to locate the containers
dedicated to the currently running build. These names are also used to obtain the ports that
the containers are listening on.  These port numbers are inserted into the test enviroment
prior to running the tests.  Once the build completes, the containers
are destroyed and resources are freed.

## Controlling Integration Test Resources
Sometimes you want to run the integration tests from the IDE which means that the
testing infrastructure, such as MongoDB, needs to be running.  There are two
convenience scripts that will start and stop the testing resources.

* `bin/start-testing-infrastructure.sh`
* `bin/stop-testing-infrastructure.sh`

# Installation
There isn't anything to install but if you want to run the application, you can launch
it from the shell: `cd build/libs && java -jar api-server-0.0.0-SNAPSHOT.jar`

# Tips and Tricks

# Troubleshooting

# Contributing

# License and Credits

# List of Changes

