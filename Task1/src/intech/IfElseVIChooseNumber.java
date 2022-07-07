//If/else
//        Используя конструкцию для ввода данных через консоль решите следующие задачи.
//        System.out.print ("Введите ……….. ");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//
//        1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 5, 4 или 1, а программа должна сказать, какое число ввёл пользователь: 5, 4, или 1.

package intech;

import java.util.Scanner;

public class IfElseVIChooseNumber {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число 5, 4 или 1");
        int i = s.nextInt();
        if (i == 5) {
            System.out.println("Вы ввели 5");
        } else {
            if (i == 4) {
                System.out.println("Вы ввели 4");
            } else {
                if (i == 1) {
                    System.out.println("Вы ввели 1");
                } else {
                    System.out.println("Wrong number! End of the Program."); // Added after the feedback from the tutor although there was no such a requirement in the 1st place for this case
                }
            }
        }
    }
}