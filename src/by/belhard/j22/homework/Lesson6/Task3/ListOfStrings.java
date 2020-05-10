//Есть список строк. Создать одну строку, состоящую из элементов списка, длина которых менее 5 символов, через пробел, и вывести ее на консоль.
// (использовать List<String>, ConvertingToStringMethod)
//Пример: список строк {“aaa”, “bbb”, “qwerty”, “”, “.”,”abcde”,“ccc”} => Вывод: “aaa bbb  . ccc”

package by.belhard.j22.homework.Lesson6.Task3;

import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {

        static String ConvertToString(List<String> random) {

            StringBuilder sb = new StringBuilder();

            for (String stringInfo : random) {
                sb.append(stringInfo);
                sb.append(" ");
            }
            return  sb.toString();
        }
    public static void main(String[] args) {

        List<String> random = new ArrayList<>();
        random.add("1234");
        random.add("2345");
        random.add("3456");
        random.add("a");
        random.add("abc");

        String result = ConvertToString(random);
        System.out.println(result);

    }
}