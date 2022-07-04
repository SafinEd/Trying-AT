// Switch
// 2. Необходимо написать программу, где бы пользователю предлагалось ввести число  202. Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202". Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 202"

package INTECH;

import java.util.Scanner;

public class Switch_1_10_Check202 { // Analogue of the 'If_Else_1_7_Check101' method
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число 202");
        int i = s.nextInt();
        if (i == 202) {
            System.out.println("Вы ввели число " + i);
        } else {
            System.err.println("Вы ввели число не равное 202");
        }
    }
}