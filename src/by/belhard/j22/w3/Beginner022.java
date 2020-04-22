package by.belhard.j22.w3;
import java.util.Scanner;
//22. Write a Java program to convert a binary number to decimal number. Go to the editor
//Input Data:
//Input a binary number: 100
//Expected Output
//
//Decimal Number: 4
public class Beginner022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a binary number : ");
        String a = in.nextLine();
        System.out.println("Decimal Number: "+Integer.parseInt(a,2));
    }
}
