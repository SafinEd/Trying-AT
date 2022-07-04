// If/else
// 3. Необходимо написать программу, где бы пользователю предлагалось ввести число  202. Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202". Если пользователь ввёл другое число, программа вообще ничего не должна делать.

package INTECH;

import java.util.Scanner;

public class If_Else_1_8_Check202 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число 202");
        int i = s.nextInt();
        if (i == 202) {
            System.out.println("Вы ввели число " + i);
        }
    }
}