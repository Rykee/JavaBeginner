package hu.rhykee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        int number7;
        System.out.print("1. number: ");
        number1 = scanner.nextInt();
        System.out.print("2. number: ");
        number2 = scanner.nextInt();
        System.out.print("3. number: ");
        number3 = scanner.nextInt();
        System.out.print("4. number: ");
        number4 = scanner.nextInt();
        System.out.print("5. number: ");
        number5 = scanner.nextInt();
        System.out.print("6. number: ");
        number6 = scanner.nextInt();
        System.out.print("7. number: ");
        number7 = scanner.nextInt();
        System.out.println(number1+number2+number3);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i = i + 1) {
            System.out.print(i + 1 + ". number: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        /*
        sum --> 0
        i -> 0
        sum = sum + numbers[0] 0 + 1
        sum --> 1
        i -> 1
        sum = sum + numbers[1] 1 + 2
        sum --> 3
         */
        System.out.println("Sum of numbers: " + sum);
    }

}
