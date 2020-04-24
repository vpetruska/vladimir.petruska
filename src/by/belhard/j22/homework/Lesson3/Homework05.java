//5) Вывести в строку через пробел все числа от 1 до 100 (включая обе границы), которые делятся без остатка на 3 и на 7 одновременно.
//*доп1. Вывести в строку через пробел все числа от 1 до 100, которые делятся без остатка либо на 5, либо на 7, но не одновременно на 5 и на 7.
//*доп2. Вывести числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99], которые делятся либо на 5, либо на 7, но не одновременно на 5 и на 7.

package by.belhard.j22.homework.Lesson3;

public class Homework05 {

    public static void main(String[] args) {

        System.out.print("Number below 100 what can be divided by 3 and 7 : ");

        for (int i = 1; i <= 100; i++) {

            if ((i % 3 == 0) && (i % 7 == 0)){

                System.out.print( i + " ");

            }

        }
        System.out.println();

        System.out.print("Number below 100 what can be divided by 5 or 7, but not at the same time : ");

        for (int i =1; i <= 100; i++) {

            if ((( i % 5 ==0) && ( i % 7 != 0)) | (( i % 7 ==0) && ( i % 5 != 0))) {

                System.out.print( i + " ");

            }

        }
        System.out.println();

        System.out.print("Number below 100 what can be divided by 5 or 7, but not at the same time in specific range: ");

        for (int i =1; i <= 100; i++) {

            if ((( i % 5 ==0) && ( i % 7 != 0)) | (( i % 7 ==0) && ( i % 5 != 0)) && ((i / 10 % 2) != 0)) {

                    System.out.print(i + " ");
            }

        }

    }

}
