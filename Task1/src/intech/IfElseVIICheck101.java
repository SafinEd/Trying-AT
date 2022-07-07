// If/else
// 2. Необходимо написать программу, где бы пользователю предлагалось ввести число  101. Если пользователь ввёл число 101, программа должна вывести сообщение: "Вы ввели число 101". Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 101"
// https://javarush.ru/groups/posts/2726-vetvlenie-v-java

package intech;

import java.util.Scanner;

public class IfElseVIICheck101 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число 101");
        int i = s.nextInt();
        if (i == 101) {
                System.out.println("Вы ввели число " + i);
            } else {
                System.err.println("Вы ввели число не равное 101");
            }
    }
}