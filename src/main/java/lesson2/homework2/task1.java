package lesson2.homework2;

import java.util.Scanner;

//  Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//  Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
//  у пользователя ввод данных.
public class task1 {
    public static void main(String[] args) {
        getFloat();
    }

    private static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        float num = 0;
        System.out.println("Введите дробное число: ");
        while (work) {
            try {
                num = Float.parseFloat(scanner.nextLine());
                System.out.println("Ваше число: " + num);
                work = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка ввода числа");
            }
        }
        return num;
    }
}
