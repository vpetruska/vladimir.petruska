package by.belhard.j22.classwork;

public class Manager extends Person{

    private int phoneNumber;


    public Manager (String name,int age, int phoneNumber){
        super(name,age);
        this.phoneNumber= phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
