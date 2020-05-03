package by.belhard.j22.homework.Lesson4.Homework03;

public class BookStorage {

    public static void main(String[] args) {

        Book book1 = new Book(
                "Fiasko",
                716,
                new Author("Lem",0)
        );

        Book book2 = new Book(
                "Novyj dozor",
                380,
                new Author( "Lukyanenko", 52)
        );

        System.out.printf("\nBook name: %s\nBook length: %s pages\nBook Author: %s and his age is %s ",book1.getName(),book1.getPages(),book1.getAuthor().getAuthorName(),book1.getAuthor().getAge());
        System.out.printf("\nBook name: %s\nBook length: %s pages\nBook Author: %s and his age is %s ",book2.getName(),book2.getPages(),book2.getAuthor().getAuthorName(),book2.getAuthor().getAge());
    }
}
