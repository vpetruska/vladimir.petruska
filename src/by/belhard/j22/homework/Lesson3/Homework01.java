//1) Создать переменную r целого типа. Присвоить ей какое-то значение. r – радиус окружности. Вывести на экран площадь круга и длину окружности.
//Усложним: перед тем, как вычислять радиус и площадь, проверьте, что r – положительно. Если так – то вычисляем, если нет – выведем на консоль сообщение о невалидности входных данных.

package by.belhard.j22.homework.Lesson3;

import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.print("Input circle radius: ");

        int r = in.nextInt();

        if (r > 0)

        {

            System.out.println("Area is = " + (Math.PI * Math.pow(r, 2)));

            System.out.println("Perimeter is = "+(Math.PI*2*r));

        }

            else

            System.out.println("Please enter valid circle radius");

    }

}
