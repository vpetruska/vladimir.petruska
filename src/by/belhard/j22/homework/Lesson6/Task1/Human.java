package by.belhard.j22.homework.Lesson6.Task1;

import java.util.Random;

public class Human {

    private String ownersName;

    public Human(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void playWithPet (){
        System.out.println("Playing with the pet ");
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + ownersName + '\'' +
                '}';
    }


}
