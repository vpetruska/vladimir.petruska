//32. Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39

package by.belhard.j22.w3;

import java.util.Scanner;

public class Beginner032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int firstNumber = in.nextInt();
        System.out.println("Input second integer: ");
        int secondNumber = in.nextInt();

        if (firstNumber == secondNumber){
        System.out.println(firstNumber +" = "+ secondNumber);}
        else
            System.out.println(firstNumber + " != " + secondNumber);

        if (firstNumber < secondNumber){
            System.out.println(firstNumber +" < "+ secondNumber);}
        else
            System.out.println(firstNumber +" > "+ secondNumber);

        if (firstNumber <= secondNumber){
            System.out.println(firstNumber +" <= "+ secondNumber);
        }
        else
            System.out.println(firstNumber +" >= "+ secondNumber);
    }
}
