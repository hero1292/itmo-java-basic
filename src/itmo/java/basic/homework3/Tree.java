package itmo.java.basic.homework3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
        this.isAlive = true;
    }

    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void displayInfo() {
        System.out.println("Название дерева: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Живое: " + (isAlive ? "Да" : "Нет"));
        System.out.println("---------------------------");
    }
}

