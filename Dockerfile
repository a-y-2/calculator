#FROM ubuntu:latest
#COPY calculator.sh /app/calculator.sh
# CMD sed -i 's/\r$//' /app/calculator.sh
# Use an official OpenJDK runtime as a base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Java program source code to the container
COPY Calculator.java /app/

# Compile the Java program
RUN javac Calculator.java

# Specify the command to run the Java program
CMD ["java", "Calculator"]
