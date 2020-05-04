package by.belhard.j22.classwork;

public class Manager extends Person{

    private int phoneNumber;

    public String Manager (String name, int age, int phoneNumber){
        super (name,age);
        this.phoneNumber= phoneNumber;
    }
}
