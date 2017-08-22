#!/bin/bash

# This is the script that the CI/CD server uses to build the project.

# arguments
BRANCH=${1-unspecified}
PATCH=${2-0}
ARTIFACTORY_USER=${3-SVNBuild}
ARTIFACTORY_PASSWORD=${4-Snoopy*09}

DOCKER_VERSION=$(docker --version)
DOCKER_GROUP_ID=$(cut -d: -f3 < <(getent group docker))
USER_ID=$(id -u $(whoami))
GROUP_ID=$(id -g $(whoami))
WORK_AREA=/work-area
HOME_DIR=$(cut -d: -f6 < <(getent passwd ${USER_ID}))

MAJOR=0
MINOR=0

echo ${DOCKER_VERSION}

CMD="docker run --group-add ${DOCKER_GROUP_ID} \
                --env HOME=${HOME_DIR} \
                --interactive \
                --rm \
                --user=${USER_ID}:${GROUP_ID} \
                --volume /var/run/docker.sock:/var/run/docker.sock \
                --volume $(pwd):${WORK_AREA} \
                --volume ${HOME_DIR}:${HOME_DIR} \
                --workdir ${WORK_AREA} \
                kurron/docker-azul-jdk-8-build:latest \
                ./gradlew -PpublishArtifacts=true \
                          -PrunIntegrationTests=true \
                          -Pmajor=${MAJOR} \
                          -Pminor=${MINOR} \
                          -Ppatch=${PATCH} \
                          -Pbranch=${BRANCH} \
                          -PpublishUsername=${ARTIFACTORY_USER} \
                          -PpublishPassword=${ARTIFACTORY_PASSWORD} \
                          -Duser.home=${HOME_DIR} \
                          --gradle-user-home=${HOME_DIR} \
                          --project-dir=${WORK_AREA} \
                          --console=plain \
                          --no-daemon \
                          --no-search-upward \
                          --stacktrace"
echo $CMD
$CMD
