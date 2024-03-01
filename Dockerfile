#FROM ubuntu:latest

#COPY calculator.sh /app/calculator.sh
# CMD sed -i 's/\r$//' /app/calculator.sh
# Use an official OpenJDK runtime as a base image
FROM openjdk:17
EXPOSE 8081
ADD target/calculator-1.0-SNAPSHOT.jar calculator-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-cp","calculator-1.0-SNAPSHOT.jar","example.example.ScientificCalculator"]
# Set the working directory inside the container
#WORKDIR /app

# Copy the Java program source code to the container
#COPY Calculator.java /app/

# Compile the Java program
#RUN javac Calculator.java

# Specify the command to run the Java program
#CMD ["java", "Calculator"]
