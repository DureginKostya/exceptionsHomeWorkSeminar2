/* Задание №2. Если необходимо, исправьте данный код
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите размерность массива: ");
            int n = Integer.parseInt(sc.next());
            int[] intArray = new int[n];
            int d = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Введите " + (i + 1) + " элемент массива: ");
                intArray[i] = Integer.parseInt(sc.next());
            }
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
