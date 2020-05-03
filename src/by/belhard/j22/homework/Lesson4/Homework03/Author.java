package by.belhard.j22.homework.Lesson4.Homework03;

public class Author {

    private String authorName;
    private int age;

    public Author(String authorName, int age) {
        this.authorName = authorName;
        this.age = age;
    }

    public String getAuthorName() {
        if (authorName != null & authorName.length() != 0)
            return authorName;
        else
            return "Unknown name";
    }

    public String getAge() {
        if (age <= 0) {
            return "18";
        } else
            return Integer.toString(age);
    }


}

