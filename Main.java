package by.minsk.epam.kozlova.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = enterNum("Enter a four-digit number ");
        int sumFirstDigits = sumFirstTwoDigits(number);
        int sumLastDigits = sumLastTwoDigits(number);
        boolean result = equalsSumTwoLastAndTwoSecondDigits(sumFirstDigits, sumLastDigits);
        System.out.println(result);
    }

    public static int enterNum(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        while (!in.hasNextInt()) {
            in.nextLine();
            System.out.println("Not a number entered");
        }
        int number = in.nextInt();
        while (number < 1000 || number > 9999) {
            System.out.println("Number is not four-digit");
            number = enterNum("Enter a four-digit number ");
        }
        return number;
    }

    public static boolean equalsSumTwoLastAndTwoSecondDigits(int numberOne, int numberTwo) {
        boolean result;
        if (numberOne == numberTwo) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static int sumFirstTwoDigits(int number) {
        int sum;
        number = number / 100;
        int secondNumber = number % 10;
        number = number / 10;
        int firstNumber = number % 10;
        sum = secondNumber + firstNumber;
        return sum;
    }

    public static int sumLastTwoDigits(int number) {
        int sum;
        int fourthNumber = number % 10;
        number = number / 10;
        int thirdNumber = number % 10;
        sum = fourthNumber + thirdNumber;
        return sum;
    }


}
