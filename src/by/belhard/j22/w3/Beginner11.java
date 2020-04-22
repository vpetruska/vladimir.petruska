package by.belhard.j22.w3;

//11. Write a Java program to print the area and perimeter of a circle. Go to the editor
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586
public class Beginner11 {
    public static void main(String[] args) {
        double a = 7.5, b = 2;
        System.out.println("Perimeter is = "+(Math.PI*2*a));
        System.out.println("Area is = "+(Math.PI*Math.pow(a,b)));
    }
}
