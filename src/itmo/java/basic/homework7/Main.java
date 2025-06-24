package itmo.java.basic.homework7;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane();
        Airplane.Wing wing1 = airplane1.createWing(1500);
        wing1.showWeight();

        Airplane airplane2 = new Airplane();
        Airplane.Wing wing2 = airplane2.createWing(1600.8);
        wing2.showWeight();
    }
}
