package by.belhard.j22.homework.Lesson3.Homework09;


public class Game {

    private String name;
    private boolean purchased;
    private int cost;
    private int size;
    private Genre genre;
    private int yearMade;
    private int numberOfPuchases;
    private int hoursPlayed;

    public Game (String name,boolean purchased,int cost,int size,Genre genre,int yearMade, int numberOfPuchases, int hoursPlayed) {
        this.name = name;
        this.purchased = purchased;
        this.cost = cost;
        this.size = size;
        this.genre = genre;
        this.yearMade = yearMade;
        this.numberOfPuchases = numberOfPuchases;
        this.hoursPlayed = hoursPlayed;
    }

    public String getName(){
        return name;
    }

    public int getCost(){

        return cost;
    }

    public boolean getPurchased() { return  purchased;}

    public int getSize(){
        return size;
    }

    public Genre getGenre(){
        return genre;

    }

    public int getYearMade(){
        return yearMade;
    }

    public int getNumberOfPuchases() { return numberOfPuchases;}

    public int buyGame(){

        if (!purchased){
            purchased = true;}

        return ++numberOfPuchases;

    }

    public int getHoursPlayed() {return hoursPlayed;}

    public int playGame()
    {
        return ++hoursPlayed;
    }






}
