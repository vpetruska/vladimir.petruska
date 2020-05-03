//2. Описать класс Table. Поля: количество ножек, высота, материал, тип (круглый, прямоугольный, другой формы), цена.
// Переопределить для него метод toString(), чтобы данные о каждом объекте выводились «красиво».
// В другом классе создать несколько экземпляров класса Table, записать их в массив, вывести на консоль все элементы массива.

package by.belhard.j22.homework.Lesson4.Homework02;


public class Table {

    private int legs;
    private int height;
    private String material;
    private Type type;
    private int price;

    public Table(int legs, int height, String material, Type type, int price) {
        this.legs = legs;
        this.height = height;
        this.material = material;
        this.type= type;
        this.price = price;
    }

    public String getLegs() { return "\nNumber of legs table have: " + legs;}

    public String getHeight() {
        return "\nHeight of the table: " + height + "cm";
    }

    public String getMaterial() {
        return "\nType of material table made from: " +material;
    }

    public String getType() {
        return "\nShape of the table: " + type.toString();
    }

    public String getPrice() { return  "\nTotal cost of the table:" + price/100 + " $ and " + price%100 + " cents" ; }


}