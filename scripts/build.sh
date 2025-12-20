#!/bin/bash

# Compile the main source code
echo "Compiling main source code..."
javac -d bin src/main/java/dsa/BinarySearch.java

# Compile the test code
echo "Compiling test code..."
javac -cp "lib/junit-platform-console-standalone.jar;bin" -d bin src/test/java/BinarySearchTest.java

# Run the tests
echo "Running tests..."
java -jar lib/junit-platform-console-standalone.jar --class-path bin --scan-class-path

echo "Done!"