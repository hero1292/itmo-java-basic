package itmo.java.basic.homework6.task4;

public class DerivedClass extends MainClass {
    DerivedClass(int number) {
        super(number);
    }

    public void printNumber() {
        System.out.println("Число: " + this.number);
    }
}
