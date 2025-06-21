package itmo.java.basic.homework6.task3;

public class Truck extends Car {
    private int wheels;
    private int maxWeight;

    public Truck() {
        super();
    }

    public Truck(int weight, String model, char color, float speed, int wheels, int maxWeight) {
        super(weight, model, color, speed);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newWheels) {
        this.wheels = newWheels;
        System.out.println("Новое количество колес: " + this.wheels);
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
