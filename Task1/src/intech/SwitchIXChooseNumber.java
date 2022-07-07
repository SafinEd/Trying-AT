//Switch
//        Используя конструкцию для ввода данных через консоль решите следующие задачи.
//        System.out.print ("Введите ……….. ");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//
//        1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 7, 3 или 2, а программа должна сказать, какое число ввёл пользователь: 7, 3, или 2.
// https://youtu.be/QJHcGWbzk3U

package intech;

import java.util.Scanner;

public class SwitchIXChooseNumber {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число 7, 3 или 2");
        int i = s.nextInt();
        switch (i){
            case 7:
                System.out.println("Вы ввели 7");
                break;
            case 3:
                System.out.println("Вы ввели 3");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            default:
                System.out.println("Wrong number! Program ended!");
        }
    }
}