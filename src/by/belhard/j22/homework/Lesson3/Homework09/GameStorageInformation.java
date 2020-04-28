package by.belhard.j22.homework.Lesson3.Homework09;
import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class GameStorageInformation {

    public static void main(String[] args) {

        boolean yesNo;
        String choise;

        Game Factorio = new Game(
                "Factorio",
                1200,
                1562,
                Genre.Strategy,
                2016,
                0,
                0
        );

        Scanner in = new Scanner(System.in);

        System.out.println("Would you like to buy game "+Factorio.getName() + "?");

        System.out.println("Yes/No");

        while (true) {
            choise = in.nextLine().trim().toLowerCase();
            if (choise.equals("yes")) {
                yesNo = true;
                break;
            }
            else if (choise.equals("no")) {
                yesNo = false;
                break;
            }
            else
                System.out.println("Pleas answer Yes or No, Thanks!");
        }

        if (yesNo = true){

            System.out.println(Factorio.getName() + " will cost you: " + Factorio.getCost() + " $");
            System.out.println("Would you like to download a game?");
                boolean downloadAnswer = in.nextBoolean();
                if (downloadAnswer = true){
                    String downloadTime = ((Factorio.getSize()/60)+" hours and "+ (Factorio.getSize() % 60) + " minutes");
                    System.out.println("With the speed of 1mb/s it would take you " + downloadTime);

                }

            }
        else
            System.out.println("qq");

    }
}
