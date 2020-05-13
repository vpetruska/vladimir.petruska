//Реализовать «частотный словарь символов». Есть какая-то строка.
// Посчитать, сколько раз каждый символ встречается в строке.
// Вывести на консоль результат подсчетов.
// В задаче используется какая-то из реализаций интерфейса Map.
// Чтобы получить массив символов из строки, используйте str.toCharArray().
//Доп: Считать большие и маленькие буквы одинаковыми, вывести количество по каждой встречающейся букве, количество пробелов и количество знаков препинания.
// Для решения изучите статические методы класса Character.


package by.belhard.j22.homework.Lesson6.Task7;

import java.util.*;

public class LetterCounterWork {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input any String");

        String a = in.nextLine();


        List<Character> getCharList = new ArrayList<>();

        for (char c : a.toLowerCase().toCharArray()) {
            getCharList.add(c);
        }

        Map<Character, Integer> charMap = new HashMap<>();

        for (Character c: getCharList) {
            charMap.put(c, 0);
        }

        for (Character c: getCharList) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            }
        }

        charMap.forEach((c,v) -> System.out.println(c + " : " + v));
        }

    }
