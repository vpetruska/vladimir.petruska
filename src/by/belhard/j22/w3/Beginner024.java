//24. Write a Java program to convert a binary number to a Octal number. Go to the editor
//Input Data:
//Input a Binary Number: 111
//Expected Output
//
//Octal number: 7

package by.belhard.j22.w3;
import java.util.Scanner;

public class Beginner024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String inputtedNumber = in.nextLine();

        int binaryNumber = Integer.parseInt(inputtedNumber,2);

        System.out.println("Octal number: " + Integer.toOctalString(binaryNumber));


    }
}
