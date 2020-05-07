package by.belhard.j22.homework.Lesson6.Task1;

public class Cat extends Pet{

    private String catName;

    public Cat(String ownersName, String catName ) {
        super(ownersName);
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    @Override
    public void playWithPet() {
        System.out.println(getOwnersName() + " cat named "+getCatName() + "is mewing and purring");
    }
}
