package by.belhard.j22.homework.Lesson6.Task1;

public class Dog extends Pet{

    private String dogName;

    public Dog(String ownersName, String dogName) {
        super(ownersName);
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    @Override
    public void playWithPet() {
        System.out.println(getOwnersName() + " dog named " + getDogName() + " is barking and jumping around");
    }
}
