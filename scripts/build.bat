@echo off

REM Compile the main source code
echo Compiling main source code...
javac -d bin src/main/java/dsa/BinarySearch.java

REM Compile the test code
echo Compiling test code...
javac -cp "lib/junit-platform-console-standalone.jar;bin" -d bin src/test/java/BinarySearchTest.java

REM Run the tests
echo Running tests...
java -jar lib/junit-platform-console-standalone.jar --class-path bin --scan-class-path

echo Done!