//33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
//Input Data:
//Input an integer: 25
//Expected Output
//
//The sum of the digits is: 7

package by.belhard.j22.w3;

import java.util.Scanner;

public class Beginner033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int inputtedNumber = in.nextInt();
        int count=0;
        int number = inputtedNumber;

        for (; inputtedNumber != 0 ; ++count ){
            inputtedNumber = inputtedNumber/10;
        }

        for (int i=0; i < count; i++){
            inputtedNumber = inputtedNumber+(number % 10);
        }
        System.out.println(inputtedNumber);
    }

}
