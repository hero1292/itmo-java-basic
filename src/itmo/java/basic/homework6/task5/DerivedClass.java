package itmo.java.basic.homework6.task5;

public class DerivedClass extends MainClass {
    String name;

    @Override
    public void getProp() {
        System.out.print("Введите ваше имя: ");
        this.name = scanner.next();
    }
}
