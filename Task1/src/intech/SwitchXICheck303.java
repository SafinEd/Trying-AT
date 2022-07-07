// Switch
// 3. Необходимо написать программу, где бы пользователю предлагалось ввести число  303. Если пользователь ввёл число 303, программа должна вывести сообщение: "Вы ввели число 303". Если пользователь ввёл другое число, программа вообще ничего не должна делать.
// https://youtu.be/QJHcGWbzk3U

package intech;

import java.util.Scanner;

public class SwitchXICheck303 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число 303");
        int i = s.nextInt();
        switch (i){
            case 303:
            System.out.println("Вы ввели число " + i);
        }
    }
}