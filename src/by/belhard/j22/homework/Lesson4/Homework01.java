//1. Вывести на консоль таблицу умножения. Постарайтесь сделать это в таком виде:

package by.belhard.j22.homework.Lesson4;

public class Homework01 {

    public static void main(String[] args) {

        int rowNumber = 1;
        int columnNumber = 1;
        int a = 1;
        System.out.print("   ");
        do{
            System.out.printf("%2d ", columnNumber);
            columnNumber++;
        } while (columnNumber < 10);

        System.out.println();

        while (rowNumber < 10){
            System.out.printf("%2d ", rowNumber);
            do {
                System.out.printf("%2d ",a*rowNumber);
                a++;
            } while (a < 10);
            a = 1;
            System.out.println();
            rowNumber++;
        }
    }
}
