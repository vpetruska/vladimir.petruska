//Создать класс Person с полем String name.
// В другом классе создать поле List<Person> persons.
// Записать в список 5 экземпляров класса Person.
// Создать метод, который будет принимать параметр String name и возвращать из списка объект Person с таким именем (либо null, если человека с таким именем нет в списке).
// После этого вызвать у получившегося объекта метод toString().

package by.belhard.j22.homework.Lesson6.Task2;

import java.util.Objects;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
