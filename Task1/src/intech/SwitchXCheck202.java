// Switch
// 2. Необходимо написать программу, где бы пользователю предлагалось ввести число  202. Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202". Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 202"
// https://youtu.be/QJHcGWbzk3U

package intech;

import java.util.Scanner;

public class SwitchXCheck202 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число 202");
        int i = s.nextInt();
        switch (i){
            case 202:
                System.out.println("Вы ввели 202");
                break;
            default:
                System.out.println("Вы ввели число не равное 202");
        }
    }
}