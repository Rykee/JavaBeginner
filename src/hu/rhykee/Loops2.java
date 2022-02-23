package hu.rhykee;

import java.util.Random;

public class Loops2 {

    public static void main(String[] args) {
        exercise1();
        System.out.println(getSummedNumberCount(1500));

        int numberToFind = 5;
        int[] numbers = {1, 5, 2, 3, 4, 5, 6, 78};

        int foundIndex = findIndexOfNumber(numbers, numberToFind);
        if (foundIndex == -1) { //-1 jön vissza a fvből ha nem volt ilyen eleme a tömbnek
            System.out.println("Nem volt ilyen szám");
        } else {
            System.out.println("Megtalaltam: " + foundIndex);
        }


        for (int j = 0; j < numbers.length; j++) {
            //Minden 5-el osztható indexű elemet kihagyunk (0,5,10..)
            if (j % 5 == 0) {
                continue;
            }
            if (numbers[j] == numberToFind) {
                System.out.println(j);
                break;
            }
        }

        //Az előző for ciklus while ciklussal
        int k = 0;
        while (k < numbers.length) {
            if (numbers[k] == numberToFind) {
                System.out.println(k);
                break;
            }
            k++;
        }

        int maxRetryCount = 5;
        int currentRetryCount = 5;
        boolean didRun = false;
        while (currentRetryCount < maxRetryCount) {
            didRun = true;
        }

        /*
        20 oldalú kockával dobálunk, addig amig nem lesz 20as
        Hányat dobtunk amig nem lett 6os
         */
        Random random = new Random();
        int throwCount = 0;
        boolean success = false;
        do {
            throwCount++;
            if (random.nextInt(20) + 1 == 20) {
                success = true;
            }
        } while (!success);
        System.out.println("Dobások száma: " + throwCount);

        for (int j = 0; j < 100; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        //Függvény hivás során a paraméterül átadott változó értéke nem változik a hivás helyén
        int number1 = 5;
        System.out.println("Number1 before function call: " + number1);
        int numberSum = sumNumbers(number1, 8);
        System.out.println("Number1 after function call: " + number1);
        System.out.println(numberSum);
    }

    private static int findIndexOfNumber(int[] numbers, int numberToFind) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToFind) {
                return i;
            }
        }
        return -1; //Ha van visszatérési értéke a fv-nek akkor minden futási ágon kell visszaadni valamit
    }

    // Az első hány szám összege fogja elérni a paraméterül megadott threshold-ot
    private static int getSummedNumberCount(int threshold) {
        int sum = 0;
        int i = 1;
        while (sum < threshold) {
            sum += i;
            i = i + 1;
            if (i == 500) { //Ha már több mint 500 számot összeadtunk és még nem értük el a thresholdot, akkor kilépünk a ciklusbol
                break;
            }
        }
        return i;
    }

    private static void exercise1() {

    }

    public static int sumNumbers(int number1, int number2) {
        number1 = 999; // Nem fog megváltozni a hivás helyén
        System.out.println("Number1 in function: " + number1);
        int sum = number1 + number2;
        return sum;
    }

    public static void sumNumbers(int a, int b, int c) {
        c = c + a + b;
    }

}
