package by.belhard.j22.homework.Lesson3.Homework09;


import java.util.Scanner;

public class GameStorageInformation {

    public static void main(String[] args) {

        Game Factorio = new Game(
                "Factorio",
                false,
                1200,
                1562,
                Genre.Strategy,
                2016,
                0,
                0
        );

        Scanner in = new Scanner(System.in);


        if (!Factorio.getPurchased()) {

            System.out.println("Would you like to buy game " + Factorio.getName() + "?");

            System.out.println("Yes/No");

            while (true) {
                String chiose;
                chiose = in.nextLine().trim().toLowerCase();
                if (chiose.equals("yes")) {
                    System.out.println(Factorio.getName() + " will cost you: " + (Factorio.getCost() / 100) + "." + (Factorio.getCost() % 100) + " $");
                    System.out.println("With average download speed of 40 Mb/s it will take " + (Factorio.getSize() / 5) / 60 + " minutes to download");
                    Factorio.buyGame();
                    break;
                } else if (chiose.equals("no")) {
                    System.out.println("You are missing on one of the best " + Factorio.getGenre() + " games of the " + Factorio.getYearMade() + " year");
                    break;
                } else
                    System.out.println("Pleas answer Yes or No, Thanks!");
            }
            System.out.println("Game were bought " + Factorio.getNumberOfPuchases() + " time(s)");
        }

            System.out.println("Would you like to play the game "+ Factorio.getName());

            while (true) {
                String chiose;
                chiose = in.nextLine().trim().toLowerCase();
                if (chiose.equals("yes")) {
                    System.out.println("How many hours you would like to play?");
                    Scanner x = new Scanner(System.in);
                    int played = x.nextInt();
                    while (played > 0) {
                        Factorio.playGame();
                        played--;
                    }
                    break;
                } else if (chiose.equals("no")) {

                    break;
                } else
                    System.out.println("Pleas answer Yes or No, Thanks!");
            }

        System.out.println("You played the game for " + Factorio.getHoursPlayed() + " hours");
        }
    }
