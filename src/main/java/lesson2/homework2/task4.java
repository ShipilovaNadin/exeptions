package lesson2.homework2;

import java.io.*;

public class task4 {
    public static void main(String[] args) {
        ex4();
    }
    private static void ex4() {
        InputStream inputStream;
        try {
            try {
                String[] strings = {"apple", "orange"};
                String strings1 = strings[2];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вызываемый индекс массива выходит за его границы" + e.getMessage());
            }
            try {
                test();
            } catch (StackOverflowError | IOException error) {
                error.printStackTrace();
                System.out.println(error.getClass().getSimpleName());
            }
            try {
                int a = 1 / 0;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("На ноль делить нельзя");
            }
            try {
                inputStream = new FileInputStream("/broken_reference");
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден" + e.getMessage());
            }
        }catch (Throwable e) {
            e.printStackTrace();
            System.out.println("Что-то сломалось");
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }
    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}


