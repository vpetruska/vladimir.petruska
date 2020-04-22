package by.belhard.j22.w3;
import java.util.Scanner;
//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
//Click me to see the solution

public class Beginner12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double a = in.nextInt();
        System.out.print("Input second number: ");
        double b = in.nextInt();
        System.out.print("Input third number: ");
        double c = in.nextInt();

        double d = (a+b+c)/3;
        System.out.println("Average :" + d);


    }
}
