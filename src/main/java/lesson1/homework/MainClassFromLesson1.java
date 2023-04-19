package lesson1.homework;

import java.util.Arrays;

public class MainClassFromLesson1 {
    static Integer[] arr = {4, 2, 6, 1, 8, 3, 4, 1, 7};
    static Integer[] arr2 = {2, 3, 3, 5, 5, 7, 2, 6, 9};
    static int[][] numMatrix = new int[][]{{1, 2, 3}, {0, 1, 4}, {1, 2, 3}};

    public static void main(String[] args) {
        //checkArray(arr);
        //System.out.println(Arrays.toString(sumArray(arr, arr2)));
        checkMatrix(numMatrix);

    }

    //1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
    // Метод должен пройтись по каждому элементу и проверить что он не равен null.
    //А теперь реализуйте следующую логику:
    //Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    //Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
    private static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.printf("элемент массива под индексом %d равен null", i);
            }
        }
    }

    // 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    // каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    private static Integer[] sumArray(Integer[] arr, Integer[] arr2) {
        if (arr == null) {
            throw new RuntimeException("Первый массив равен null");
        }
        if (arr2 == null) {
            throw new RuntimeException("Второй массив равен null");
        }
        if (arr.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        Integer[] resultArray = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArray[i] = arr[i] + arr2[i];
        }
        return resultArray;
    }
    // 3*. Реализуйте метод, принимающий в качестве аргументов двумерный массив.
    // Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
    // детализировать какие строки со столбцами не требуется.

    private static void checkMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException("Matrix is null");
        }
        if (matrix.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Matrix is empty");
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                throw new RuntimeException("Длинна строк и столбцов неодинакова");
            }
        }
        System.out.println("Длинна строк и столбцов совпадает");
    }

}

