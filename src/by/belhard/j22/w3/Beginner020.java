package by.belhard.j22.w3;
import java.util.Scanner;

//20. Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
//Input Data:
//Input a decimal number: 15
//Expected Output
//
//Hexadecimal number is : F
public class Beginner020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Decimal number : ");
        int a = in.nextInt();
        System.out.println("Hexadecimal number is : "+Integer.toHexString(a));
    }
}
