//Switch
//        Используя конструкцию для ввода данных через консоль решите следующие задачи.
//        System.out.print ("Введите ……….. ");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//
//        1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 7, 3 или 2, а программа должна сказать, какое число ввёл пользователь: 7, 3, или 2.

package INTECH;

import java.util.Scanner;

public class Switch_1_9_ChooseNumber { // analogue of the 'If_Else_1_6_ChooseNumber' method
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число 7, 3 или 2");
        int i = s.nextInt();
        if (i == 7) {
            System.out.println("Вы ввели 7");
        } else {
            if (i == 3) {
                System.out.println("Вы ввели 3");
            } else {
                if (i == 2) {
                    System.out.println("Вы ввели 2");
                }
            }
        }
    }
}