package by.belhard.j22.homework.Lesson6.Task2;


import java.util.*;

public class AClass {

    public static void main(String[] args) {

        List<Person> humanList = new ArrayList<>();
        humanList.add(new Person("Oleg"));
        humanList.add(new Person("Marat"));
        humanList.add(new Person("Kris"));
        humanList.add(new Person("George"));
        humanList.add(new Person("Trevor"));

        Scanner in = new Scanner(System.in);
        System.out.print("Input persons name: ");
        String inputtedName = in.next();

        Person p1 = new Person(inputtedName);

        if (humanList.contains(p1)){
            System.out.println(p1);
        }

    }

}
