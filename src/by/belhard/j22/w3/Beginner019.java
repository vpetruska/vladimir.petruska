package by.belhard.j22.w3;
import java.util.Scanner;

//19. Write a Java program to convert a decimal number to binary number. Go to the editor
//Input Data:
//Input a Decimal Number : 5
//Expected Output
//
//Binary number is: 101
public class Beginner019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Decimal number : ");
        int a = in.nextInt();
        System.out.println("Binary number is: "+Integer.toBinaryString(a));
    }
}
