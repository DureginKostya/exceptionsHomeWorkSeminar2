/* Задание №4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputData();
    }
    private static void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = sc.nextLine();
        if (line.isEmpty()) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.err.println("Вводить пустые строки нельзя\n");
            }
        } else System.out.println("Введена строка: " + line);
    }
}
