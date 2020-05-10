//Создать множество целых чисел (HashSet<Integer>). Записать в него 10 случайных чисел.
// Создать переменную int border и присвоить ей случайное значение.
// Удалить из множества все числа, меньше чем border, и вывести содержимое множества на консоль.

package by.belhard.j22.homework.Lesson6.Task6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ManyNumbers {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(45);
        set.add(425);
        set.add(445);
        set.add(1);
        set.add(-25);
        set.add(0);

        int border = 7;

        for (Iterator<Integer> i = set.iterator(); i.hasNext();) {
            Integer a = i.next();
            if (a < border ) {
                i.remove();
            }
        }

        System.out.println(set);

    }
}

