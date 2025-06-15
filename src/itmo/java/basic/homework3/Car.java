package itmo.java.basic.homework3;

public class Car {
    private String color;
    private String name;
    private Double weight;

    public Car() {}

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("---------------------------");
    }
}