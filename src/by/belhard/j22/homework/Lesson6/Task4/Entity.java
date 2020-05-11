//Создать класс с одним полем [например, class Entity {private String name; // конструктор, геттер, сеттер, toString} ]
//Записать в список ArrayList 5 экземпляров этого класса.
//Создать метод, который принимает String как параметр и возвращает из списка объект Entity, у которого поле name совпадает с переданным параметром.
//Например, public static Entity getByName(String name) {//реализация}


package by.belhard.j22.homework.Lesson6.Task4;

import java.util.List;
import java.util.Objects;

public class Entity {

    private String name;


    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void getByName(String name, List<Entity> entities) {

        for (int i = 0; i < entities.size(); i++) {
            if (entities.get(i).toString().equals(name))
                System.out.println(entities.get(i).toString());
        }

    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



}
