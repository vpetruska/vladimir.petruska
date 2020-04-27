//8) Создать класс Игрок. Игрок имеет координаты x и y. Игрок должен уметь (через методы):
//а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему),
//б) вывести на консоль значение текущего положения,
//доп1*) игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.

package by.belhard.j22.homework.Lesson3.Homework08;

import java.util.Scanner;

public class Player {

    private int x;
    private int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int moveX() {

        Scanner in = new Scanner(System.in);

        System.out.print("Move coordinate x to: ");

        return x = in.nextInt();

    }

    public int moveY() {

        Scanner in = new Scanner(System.in);

        System.out.print("Move coordinate y to: ");

        return y = in.nextInt();

    }
}