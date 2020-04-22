package by.belhard.j22.w3;
import java.util.Scanner;
//18. Write a Java program to multiply two binary numbers. Go to the editor
//Input Data:
//Input the first binary number: 10
//Input the second binary number: 11
//Expected Output
// Product of two binary numbers: 110
public class Beginner018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        int a = in.nextInt();
        System.out.print("Input second second number: ");
        int b = in.nextInt();
        String a2 = Integer.toString(a);
        String b2 = Integer.toString(b);

        int a1 = Integer.parseInt(a2,2);
        int b1 = Integer.parseInt(b2,2);

        System.out.println(Integer.toBinaryString(a1*b1));
    }
}
