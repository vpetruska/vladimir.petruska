//3) Даны зарплаты трех людей salary1, salary2 и salary3. Найти разницу между максимальной и минимальной зарплатой.

package by.belhard.j22.homework.Lesson3;

import java.util.Scanner;


public class Homework03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input first persons salary: ");

        int salary1 = in.nextInt();

        System.out.print("Input second persons salary: ");

        int salary2 = in.nextInt();

        System.out.print("Input third persons salary: ");

        int salary3 = in.nextInt();

        int maxSalary, minSalary;

        if (salary1>salary2 && salary1>salary3){

            maxSalary = salary1;

        }
            else
                if (salary2 > salary3){

                    maxSalary = salary2;
                }

                else

                    maxSalary = salary3;

        if (salary1<salary2 && salary1<salary3){

            minSalary = salary1;

        }

            else

                if (salary2 < salary3){

                    minSalary = salary2;

                }

                else

                    minSalary = salary3;

        System.out.println("Difference between maximum salary and minimum is : " + ((maxSalary) - (minSalary)));

    }

}
