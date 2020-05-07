package by.belhard.j22.homework.Lesson6.Task1;

public class Fish extends Pet{

    private String fishName;

    public Fish(String ownersName, String fishName) {
        super(ownersName);
        this.fishName = fishName;
    }

    @Override
    public void playWithPet() {
        System.out.println(getOwnersName() + " fish named " + getFishName() + " is swimming in circles");
    }

    public String getFishName() {
        return fishName;
    }
}
