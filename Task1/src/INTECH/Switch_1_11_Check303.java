// Switch
// 3. Необходимо написать программу, где бы пользователю предлагалось ввести число  303. Если пользователь ввёл число 303, программа должна вывести сообщение: "Вы ввели число 303". Если пользователь ввёл другое число, программа вообще ничего не должна делать.

package INTECH;

import java.util.Scanner;

public class Switch_1_11_Check303 { // analogue of the 'If_Else_1_8_Check202' method
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число 303");
        int i = s.nextInt();
        if (i == 303) {
            System.out.println("Вы ввели число " + i);
        }
    }
}