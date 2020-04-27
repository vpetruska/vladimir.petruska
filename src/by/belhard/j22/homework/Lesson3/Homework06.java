//6) Создать массив целых чисел, записать в него 10 значений. Посчитать и вывести сумму всех значений и среднее значение.
//*доп. Посчитать и вывести медиану Медиана (вики).

package by.belhard.j22.homework.Lesson3;

import java. util. Arrays;

public class Homework06 {

    public static void main(String[] args) {

        int [] array = new int[]{35,50,60,44,52,1,2,66,799,10};

        int sum = 0;

        for (int i=0; i < array.length; i++){

            sum += array[i];

        }

        System.out.println("Sum of values in the array: " +sum);

        System.out.println("Average value in the array: " +sum/array.length);

        Arrays.sort(array);

        System.out.println("Median value of the array: " + (array[5]+array[6]) / 2);
    }
}


