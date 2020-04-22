package by.belhard.j22.w3;
import java.util.Scanner;
//17. Write a Java program to add two binary numbers. Go to the editor
//Input Data:
//Input first binary number: 10
//Input second binary number: 11
//Expected Output
//
//Sum of two binary numbers: 101
public class Beginner017 {
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
        System.out.println(Integer.toBinaryString(a1+b1));
    }




}
