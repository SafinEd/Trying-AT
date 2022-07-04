// 3. Написать программу, которая увеличивает вам зарплату каждый месяц на $1000, используя циклы while/ do ... while, for. (Все три реализации)

package INTECH;

public class Cycles_1_3_SalaryIncrease {

    public static void main(String[] args) {
        System.out.println("The cycle is stopped when the salary of 13000$ is reached.");
        System.out.println("");
        System.out.println("The 1st realization:");
        System.out.print("Your salary this month was ");
        for (int i=1000; i<13000; i+=1000) {
            System.out.print(i);
            System.out.println("$");
            System.out.print("Your salary this month was increased by 1000$ and now equals ");
        }
        System.out.println("13000$");
        System.out.println("");

        System.out.println("The 2nd realization:");
        System.out.print("Your salary this month was ");
        int j = 1000;
        while (j < 13000) {
            System.out.print(j);
            System.out.println("$");
            System.out.print("Your salary this month was increased by 1000$ and now equals ");
            j += 1000;
        }
        System.out.println("13000$");
        System.out.println("");

        System.out.println("The 3d realization:");
        System.out.print("Your salary this month was ");
        boolean isTrue = true;
        int k = 1000;
        while (isTrue) {
            System.out.print(k);
            System.out.println("$");
            System.out.print("Your salary this month was increased by 1000$ and now equals ");
            k += 1000;
            if (k >= 13000)
                isTrue = false;
        }
        System.out.println("13000$");
    }
}