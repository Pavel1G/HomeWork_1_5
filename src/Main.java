import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1_2_3_4();
        task5();
        task6();
    }

    // Задача 1.
    public static void task1_2_3_4() {
        int[] digits = new int[3];
        digits[0] = 1;
        digits[1] = 2;
        digits[2] = 3;

        double[] fractionalDigits = {1.57, 7.654, 9.986};

        int[] randomDigits = new int[5];
        for (int i = 0; i < randomDigits.length; i++) {
            randomDigits[i] = (int) (Math.random() * 11);
        }

        //Задача 2.

        for (int i = 0; i < digits.length; i++) {
            if (i == digits.length - 1) {
                System.out.print(digits[i]);
            } else {
                System.out.print(digits[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fractionalDigits.length; i++) {
            if (i == fractionalDigits.length - 1) {
                System.out.print(fractionalDigits[i]);
            } else {
                System.out.print(fractionalDigits[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < randomDigits.length; i++) {
            if (i == randomDigits.length - 1) {
                System.out.print(randomDigits[i]);
            } else {
                System.out.print(randomDigits[i] + ", ");
            }
        }
        System.out.println();

        //Задача 3.

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(digits[i]);
            } else {
                System.out.print(digits[i] + ", ");
            }
        }
        System.out.println();

        for (int i = fractionalDigits.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(fractionalDigits[i]);
            } else {
                System.out.print(fractionalDigits[i] + ", ");
            }
        }
        System.out.println();

        for (int i = randomDigits.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(randomDigits[i]);
            } else {
                System.out.print(randomDigits[i] + ", ");
            }
        }
        System.out.println();

        // Задача 4.
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 != 0) {
                digits[i]++;
            }
        }

        for (int i = 0; i < digits.length; i++) {
            if (i == digits.length - 1) {
                System.out.print(digits[i]);
            } else {
                System.out.print(digits[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------");
    }

    //Task 5
    public static void task5() {
        int size = 5;
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }

        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }

    public static void task6() {
        int[] arrayInvert = {5, 4, 3, 2, 1};
        int[] array = new int[arrayInvert.length];

        for (int i = 0; i < arrayInvert.length; i++) {
            array[i] = arrayInvert[arrayInvert.length - 1 - i];
        }

        System.out.println(Arrays.toString(arrayInvert));
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------------------------------");
    }
}