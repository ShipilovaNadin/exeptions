package lesson2;

import java.util.Scanner;

public class MainClassLesson2 {
    public static void main(String[] args) {

        //ex1();
        //solve1();
//        int sum = ex2(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}});
//        System.out.println(sum);
        int sum = solve2(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}});
        System.out.println(sum);

    }

    private static int ex2(String arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    static int solve2(String[][] arr) {
        int sum = 0;

        try {
            if (arr == null) {
                throw new NullPointerException("Массив не может быть null. Невозможно вычислить сумму");
            }

            for (String[] strings : arr) {
                if (strings.length >= 5) {
                    throw new ArrayIndexOutOfBoundsException("Невалидный размер массива. Внутренний массив должен "
                            + "иметь размер 5");
                }
                for (int j = 0; j < 5; j++) {
                    int val = 0;
                    try {
                        val = Integer.parseInt(strings[j]);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    sum += val;
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw new NullPointerException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Непредвиденное исключение. " + e.getMessage());
        }
        return sum;
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt();
        try {
            arr[index] = 1;
        } catch (Exception e) {
            System.out.println("Указан индекс за пределам массива");
        }
    }
    static void solve1() {
        try {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = 0;
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Ошибка ввода числа");
            }
            index = scanner.nextInt();
            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Указан индекс за пределам массива");
            }
            arr[index] = 1;
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка");
            e.printStackTrace();
        }
    }

}
