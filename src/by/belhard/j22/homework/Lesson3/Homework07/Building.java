//7) Опишите (то есть создайте класс, описывающий…) сущность Здание. Здание можно охарактеризовать назначением (например, жилой дом, офисное здание, промышленный объект, хоз. постройка и т.д.),
// адресом, количеством этажей, наличием(или отсутствием) лифта, материалом, из которого оно построено, годом постройки.
// Адрес состоит из улицы и номера дома.
package by.belhard.j22.homework.Lesson3.Homework07;



public class Building {

    public Type type;
    public Address address;
    public int floors;
    public Elevator elevator;
    public String material;
    public int yearBuild;

}
