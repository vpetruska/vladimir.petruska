//3. Описать класс Книга. Поля: название, количество страниц, автор, формат. Автор – тоже класс, содержит имя, возраст.
//При создании экземпляров описанных классов нужно проверять, что введены валидные данные (количество страниц и возраст должны быть больше 2,
// название книги и имя автора – не пустые (name != null и name.length() != 0).
// Если данные не проходят валидацию, то присваивать полям какие-то дефолтные значения).
// Уделите внимание правильному описанию всех частей класса: приватные поля, методы доступа к полям (геттеры и сеттеры), подумайте, какой доступ вы хотите предоставить, а какой – ограничить.
// Не забудьте про метод toString().

package by.belhard.j22.homework.Lesson4.Homework03;

public class Book {

    private String name;
    private int pages;
    private Author author;

    public Book(String name, int pages, Author author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public String getName() {
        if (name == null) {
            return "Unknown Author";
        }
        else
        return name;
    }

    public String getPages() {
        if (pages <= 2) {
            return "2";
        } else
            return Integer.toString(pages);

    }

    public Author getAuthor() {
       return author;
   }
}
