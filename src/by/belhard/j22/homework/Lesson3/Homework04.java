//4) Банк предлагает вклад под процент. Дано: начальная сумма вклада startSum, процент годовых proc, количество лет years, на которые совершается вклад.
// Сумма индексируется каждый год (это значит, что после каждого года процент начисляется не на изначальную сумму, а на текущую).
// Вывести, сколько денег будет на счету после years лет.
//*доп. Каждый год банк вычитает из суммы вклада налог в размере 1% от изначального вклада.

package by.belhard.j22.homework.Lesson3;

import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input starting deposit value: ");

        int startSum = in.nextInt();

        int initialStartSum = startSum;

        System.out.print("Input annual interest rate: ");

        int proc = in.nextInt();

        System.out.print("Input number of years for your deposit: ");

        int years = in.nextInt();

        for (int i = 0; i < years ; i++) {

           startSum = startSum + startSum/100*proc;

           startSum = startSum - initialStartSum/100;

        }

        System.out.println("Your deposit value after " + years + " year(s) will be : " + startSum);

    }

}


