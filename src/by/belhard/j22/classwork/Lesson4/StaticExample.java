package by.belhard.j22.classwork.Lesson4;

public class StaticExample {
    public static void main(String[] args) {
        StaticCounter staticCounter1 = new StaticCounter();
        StaticCounter staticCounter2 = new StaticCounter();

        StaticCounter.inc();
        staticCounter1.getI();

    }
}
