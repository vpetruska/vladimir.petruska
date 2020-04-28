package by.belhard.j22.homework.Lesson3.Homework09;

import java.time.LocalDate;


public class Game {

    private String name;
    private int cost;
    private int size;
    private Genre genre;
    private int yearMade;
    private int review;
    private int playTime;

    public Game (String name,int cost,int size,Genre genre,int yearMade, int review, int playTime) {
        this.name = name;
        this.cost = cost;
        this.size = size;
        this.genre = genre;
        this.yearMade = yearMade;
        this.review = review;
        this.playTime = playTime;
    }

    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }

    public int getSize(){
        return size;
    }

    public Genre getGenre(){
        return genre;

    }

    public int getYearMade(){
        return yearMade;
    }

    public int getReview(){
        return review;

    }

    public String getPlayTime(){

      String newPlayTime = ((playTime / 24)+" days" + (playTime % 24)+ " hours");

        return newPlayTime;

    }


}
