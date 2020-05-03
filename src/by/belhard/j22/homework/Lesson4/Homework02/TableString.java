package by.belhard.j22.homework.Lesson4.Homework02;


public class TableString {


    public static void main(String[] args) {

        Table workdesk = new Table(
                4,
                100,
                "wood",
                Type.RECTANGLE,
                1000
        );

        Table kitchen = new Table(
                3,
                110,
                "wood + metal",
                Type.ROUND,
                770
        );

        Table pctable = new Table(
                2,
                95,
                "metal + glass",
                Type.OTHER,
                1120
        );

        String [] home = new String[3];
        home [0] = workdesk.getLegs() + workdesk.getHeight() + workdesk.getMaterial() + workdesk.getType() + workdesk.getPrice();
        home [1] = kitchen.getLegs() + kitchen.getHeight() + kitchen.getMaterial() + kitchen.getType() +  kitchen.getPrice();
        home [2] = pctable.getLegs() + pctable.getHeight() + pctable.getMaterial() + pctable.getType() + pctable.getPrice();

        System.out.printf("%s\n%s\n%s",home[0],home[1],home[2]);
    }

}
