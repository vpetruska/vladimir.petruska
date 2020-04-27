//7) Опишите (то есть создайте класс, описывающий…) сущность Здание. Здание можно охарактеризовать назначением (например, жилой дом, офисное здание, промышленный объект, хоз. постройка и т.д.),
// адресом, количеством этажей, наличием(или отсутствием) лифта, материалом, из которого оно построено, годом постройки.
// Адрес состоит из улицы и номера дома.
package by.belhard.j22.homework.Lesson3.Homework07.BuildingStatus;


public class Building {

    private Type type;
    private Address address;
    private int floors;
    private Elevator elevator;
    private String material;
    private int yearBuild;

    public Building (Type type, Address address, int floors, Elevator elevator, String material, int yearBuild) {
    this.type = type;
    this.address = address;
    this.floors = floors;
    this.elevator = elevator;
    this.material = material;
    this.yearBuild = yearBuild;
    }

    public Type getType() {
        return type;
    }

    public Address getAddress() {
        return  address;
    }

    public int getFloors() {
        return floors;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public String getMaterial() {
        return material;
    }

    public int getYearBuild() {
        return yearBuild;
    }
}
