#!/bin/bash

python3 -m http.server 8084 --directory ./src &
grunt
