package by.belhard.j22.homework.Lesson6.Task1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class PlayingWithPet {

    public static void main(String[] args) {
        //create pets
        Fish sparky = new Fish ("Oleg","Sparky");
        Cat whiskers = new Cat("Oleg", "Whiskers");
        Dog butch = new Dog ("Oleg", "Butch");
        //input method to play with pet
        sparky.playWithPet();
        whiskers.playWithPet();
        butch.playWithPet();
        //play with random pet
        List<Pet> petList = new ArrayList<>();
        petList.add(sparky);
        petList.add(whiskers);
        petList.add(butch);

        Random rand = new Random();
        int randomIndex = rand.nextInt(petList.size());
        Pet randomPet = petList.get(randomIndex);

        randomPet.playWithPet();

    }
}
