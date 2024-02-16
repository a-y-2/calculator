package example.example;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm (ln)");
            System.out.println("4. Power Function");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    System.out.println(performSquareRoot(num));
                    break;
                case 2:
                    System.out.print("Enter a non-negative integer: ");
                    double num1 = scanner.nextInt();
                    System.out.println(performFactorial(num1));
                    break;
                case 3:
                    System.out.print("Enter a positive number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println(performNaturalLogarithm(num2));
                    break;
                case 4:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(performPowerFunction(base,exponent));
                    break;
                case 0:
                    System.out.println("Exiting Calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static double performSquareRoot(double num) {

//        if (num >= 0) {
//            System.out.println("Result: " + Math.sqrt(num));
//        } else {
//            System.out.println("Error: Cannot calculate square root of a negative number");
//        }
        if(num < 0 || Double.isNaN(num))  {
            return Double.NaN;
        }
        else {
            return(Math.sqrt(num));
        }

    }

    public static double performFactorial(double num) {


        long result = 1;
        if(num < 0 || Double.isNaN(num)){
            return Double.NaN;
        }
        if(num == 0){
            result=1;
        }


        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return(result);
    }

    public static double performNaturalLogarithm(double num) {

        if(num < 0 || Double.isNaN(num)){
            return Double.NaN;
        }

        return  Math.log(num);
    }

    public static double performPowerFunction(double base,double exponent) {
        if(Double.isNaN(base) || Double.isNaN(exponent)){
            return Double.NaN;
        }


        return Math.pow(base, exponent);
    }
}
