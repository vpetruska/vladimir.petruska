package by.belhard.j22.w3;
import java.util.Scanner;
//7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80
public class Beginner7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        int b = 1;
        do {
            System.out.println(a + " x " + b + " = " + a * b);
            b++;
        } while (b <= 10);
    }
}