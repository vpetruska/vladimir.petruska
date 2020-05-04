package by.belhard.j22.classwork;

public class Worker extends Person{

    private String factoryName;

    public Worker(String name, int age,String factoryName) {

        super(name,age);
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}

