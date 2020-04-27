package by.belhard.j22.homework.Lesson3.Homework08;


public class PlayerMovement {
    public static void main(String[] args) {

        Player newPlayer = new Player(
                0,
                0
        );
        int previousLocationX = newPlayer.getX();
        int previousLocationY = newPlayer.getY();
        int totalMovement;

        newPlayer.moveX();
        newPlayer.moveY();

        totalMovement = (Math.abs(newPlayer.getX()-previousLocationX) + Math.abs(newPlayer.getY()-previousLocationY));

        System.out.println("New coordinates are:");
        System.out.println("x: " + newPlayer.getX());
        System.out.println("y: " + newPlayer.getY());
        System.out.println("Total movement = " + totalMovement);
    }

}
