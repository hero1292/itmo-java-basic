package itmo.java.basic.homework6.task3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(5000, "Volvo", 'B', 90.5f, 6, 12000);
        truck.outPut();
        System.out.println("Количество колес: " + truck.getWheels());
        System.out.println("Максимальный вес: " + truck.getMaxWeight());

        truck.newWheels(8);
    }
}
