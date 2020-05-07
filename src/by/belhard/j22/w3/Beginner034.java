//34. Write a Java program to compute the area of a hexagon. Go to the editor
//Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//where s is the length of a side
//Input Data:
//Input the length of a side of the hexagon: 6
//Expected Output
//
//The area of the hexagon is: 93.53074360871938

package by.belhard.j22.w3;

import java.util.Scanner;

public class Beginner034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon: ");
        int side = in.nextInt();
        double area = (6 * (side*side)/(4 * Math.tan(Math.PI/6)));
        System.out.println("The area of the hexagon is: "+area  );
    }
}
