package by.belhard.j22.w3;

//13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
//Test Data:
//Width = 5.5 Height = 8.5
//
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20
public class Beginner013 {
    public static void main(String[] args) {
        double a = 5.6, b = 8.5;
        double c = a*b;
        double d = 2*(a+b);
        System.out.printf("Area is %.1f * %.1f = %.2f\n", a, b, c);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f", a,b,d);
    }

}
