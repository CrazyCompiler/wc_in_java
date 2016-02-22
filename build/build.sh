rm -rf app/*.class
javac -cp "src:lib/junit-4.12.jar" -d classFiles $1
