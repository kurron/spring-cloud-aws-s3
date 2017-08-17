#!/bin/bash

# Some of these values are for illustration only and don't actually affect the build.
# The important concepts is that the source directory needs to be mounted into the
# container and that user/group ids must match yours or the generated files will be
# owned by the wrong account.

# start fresh
rm -rf build .gradle

# run the official build script with some minor tweaks
bin/official-build.sh simulation
