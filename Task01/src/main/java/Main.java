/* Задание №1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = request("Введите вещественное число: ", 3);
        if (number == -1) System.out.println("\nВещественное число не было введено. Выполнение программы завершено.");
        else System.out.printf("Введено число: %.3f", number);
    }
    private static float request(String msg, int counter) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("\nКоличество попыток: %d\n", counter);
            System.out.print(msg);
            return Float.parseFloat(sc.next()) ;
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное значение");
            counter--;
            if (counter != 0) return request("Повторите ввод: ", counter);
            else return -1;
        }
    }
}
