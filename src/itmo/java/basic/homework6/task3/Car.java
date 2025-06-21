package itmo.java.basic.homework6.task3;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public Car() {}

    public Car(int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }
}
