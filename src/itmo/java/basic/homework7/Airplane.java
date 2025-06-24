package itmo.java.basic.homework7;

public class Airplane {
    public class Wing {
        private double weight;

        public Wing(double weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println("Вес крыла: " + this.weight + " кг");
        }
    }

    public Wing createWing(double weight) {
        return new Wing(weight);
    }
}
