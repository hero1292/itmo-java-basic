package itmo.java.basic.homework3;

import java.time.Year;

public class House {
    private int floors;
    private int buildYear;
    private String name;

    public void setHouseData(int floors, int buildYear, String name) {
        this.floors = floors;
        this.buildYear = buildYear;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Наименование: " + name);
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год постройки: " + buildYear);
        System.out.println("Возраст дома: " + getHouseAge() + " лет");
        System.out.println("---------------------------");
    }

    private int getHouseAge() {
        int currentYear = Year.now().getValue();
        return currentYear - buildYear;
    }
}
