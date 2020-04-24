//2) Дана температура в градусах. Вывести на экран , что лучше надеть: куртку, свитер, майку или ничего.
//Например,при температуре менее 10 – куртку, от 10 до 15 – ветровку, от 16 до 20 свитер,от 21 до 30 майку, выше 30 – ничего.

package by.belhard.j22.homework.Lesson3;

import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.print("Input today's temperature: ");

        int c = in.nextInt();

        if (c < 10) {

            System.out.println("I suggest you wear a jacket");

        }

            else

                if (c <= 15) {

                System.out.println("I suggest you wear а windbreaker");

                }

                else

                    if (c <= 20){

                        System.out.println("I suggest you wear a sweater");

                    }

                    else

                        if (c <= 30){

                            System.out.println("I suggest you wear a t-shirt");

                        }

                        else

                            System.out.println("You can go naked");

    }

}

