package by.belhard.j22.w3;
import java.util.Scanner;
//21. Write a Java program to convert a decimal number to octal number. Go to the editor
//Input Data:
//Input a Decimal Number: 15
//Expected Output
//
//Octal number is: 17
public class Beginner021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Decimal number : ");
        int a = in.nextInt();
        System.out.println("Octal number is : " + Integer.toOctalString(a));
    }
}