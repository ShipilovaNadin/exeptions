package lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //foo();
       // ex1();
        int matrix2[][] = {{1,0,1},{1,1,0},{0,0,1}};
        Random rnd = new Random();
        int matrix[][] = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(2);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(ex2(matrix));
        System.out.println(ex2(matrix2));
    }
    private static void foo() {
        try {
            int a = 2;
            int b = 3;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    private static void ex1() {
        int[] arr = {4, 2, 6, 7, 8, 3, 2, 1, 7};
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int n = in.nextInt();
        int index = searchNum(arr, n);
        switch (index) {
            case -1 -> System.out.println("Длина массива менее 3");
            case -2 -> System.out.println("Искомое число не найдено");
            case -3 -> System.out.println("Массив не может быть null");
            default -> System.out.printf("Искомое число %s находится под индексом %s%n", n, index);
        }
    }

    private static int searchNum(int[] arr, int n) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < 3) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -2;
    }

    private static int ex2(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length) { // проверяем длина строки под индексом i равна длине массива
                throw new RuntimeException("Массив не квадратный!");
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) { // проверяем все ли элементы массива равны 0 или 1
                    throw new RuntimeException("В массиве есть элементы, отличные от 0 и 1!");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
