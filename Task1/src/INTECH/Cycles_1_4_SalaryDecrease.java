// 4. Написать программу, которая вам уменьшает зп с $10000 до $0 каждый месяц используя циклы while/ do ... while, for. (Все три реализации).

package INTECH;

public class Cycles_1_4_SalaryDecrease {

    public static void main(String[] args) {
        System.out.println("The 1st realization:");
        System.out.print("Your salary this month was ");
        for (int i=10000; i>0; i-=1000) {
            System.out.print(i);
            System.out.println("$");
            System.out.print("Your salary this month was decreased by 1000$ and now equals ");
        }
        System.out.print("0$");
        System.out.println(". So feel free to fly like a bird in the sky!");
        System.out.println("");

        System.out.println("The 2nd realization:");
        System.out.print("Your salary this month was ");
        int j = 10000;
        while (j > 0) {
            System.out.print(j);
            System.out.println("$");
            System.out.print("Your salary this month was decreased by 1000$ and now equals ");
            j -= 1000;
        }
        System.out.print("0$");
        System.out.println(". So feel free to fly like a bird in the sky!");
        System.out.println("");

        System.out.println("The 3d realization:");
        System.out.print("Your salary this month was ");
        boolean isTrue = true;
        int k = 10000;
        while (isTrue) {
            System.out.print(k);
            System.out.println("$");
            System.out.print("Your salary this month was decreased by 1000$ and now equals ");
            k -= 1000;
            if (k <= 0)
                isTrue = false;
        }
        System.out.print("0$");
        System.out.println(". So feel free to fly like a bird in the sky!");
    }
}