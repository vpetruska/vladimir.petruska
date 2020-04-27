package by.belhard.j22.homework.Lesson3.Homework07;

import by.belhard.j22.homework.Lesson3.Homework07.BuildingStatus.Address;
import by.belhard.j22.homework.Lesson3.Homework07.BuildingStatus.Building;
import by.belhard.j22.homework.Lesson3.Homework07.BuildingStatus.Elevator;
import by.belhard.j22.homework.Lesson3.Homework07.BuildingStatus.Type;

public class BuildingInformationHandler {

    public static void main(String[] args) {

        Building workBuilding = new Building(
                Type.OFFICE,
                new Address("Zheleznodorozhnaya", 33),
                9,
                Elevator.YES,
                "Concrete",
                2002
        );
        System.out.println("Type of building: " +workBuilding.getType());
        System.out.println("Address: " + workBuilding.getAddress().getStreet() + " " + workBuilding.getAddress().getNumber());
        System.out.println("How many floors build have: " + workBuilding.getFloors());
        System.out.println("Does building have an elevator: " + workBuilding.getElevator());
        System.out.println("What material used for the building: " + workBuilding.getMaterial());
        System.out.println("What year is was build: " + workBuilding.getYearBuild());
    }
}
