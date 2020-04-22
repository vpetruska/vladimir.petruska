package by.belhard.j22.w3;
import java.util.Scanner;
//15. Write a Java program to swap two variables. Go to the editor
public class Beginner015 {
    public static void main(String[] args) {
        int a , b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = in.nextInt();
        System.out.print("Input second number: ");
        b = in.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("Now first number is " + a + " and second number is "+ b);
    }
}
