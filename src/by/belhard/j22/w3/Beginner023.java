package by.belhard.j22.w3;
import java.util.Scanner;
//23. Write a Java program to convert a binary number to hexadecimal number. Go to the editor
//Input Data:
//Input a Binary Number: 1101
//Expected Output
//
//HexaDecimal value: D
public class Beginner023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String a = in.nextLine();
        int b = Integer.parseInt(a,2);
        System.out.println("HexaDecimal value: "+Integer.toHexString(b));
    }
}
