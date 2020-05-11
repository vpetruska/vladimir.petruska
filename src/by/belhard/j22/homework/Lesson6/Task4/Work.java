//Создадим словарь Map<Entity, List<String>> entityMap = … , то есть словарь хранит пары, в которых ключ – объект класса Entity, а значение – список строк.
//Запишем в entityMap 5 пар.
//например, первая пара [new Entity(“Vasily”) : new ArrayList<>(){{add.(“milk”);add(“bread”);}}]
//вторая пара [new Entity(“Ivan”) : new ArrayList<>(){{add.(“bread”); add.(“butter”); add.(“salt”);}}]
//… и т.д. Будем считать, что это какие-то люди и список их покупок.
//Посчитать, сколько штук каждого продукта всего надо купить и вывести на консоль список покупок по продуктам, можно еще отсортировать по алфавиту.


package by.belhard.j22.homework.Lesson6.Task4;

import java.util.ArrayList;
import java.util.List;


public class Work {

    public static void main(String[] args) {

        List <Entity> list = new ArrayList<>();

        list.add(new Entity("Oleg"));
        list.add(new Entity("Mark"));
        list.add(new Entity("Tom"));
        list.add(new Entity("Travis"));
        list.add(new Entity("Paul"));







    }


}
