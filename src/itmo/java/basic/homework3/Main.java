package itmo.java.basic.homework3;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Task 1");

        Study study = new Study("Изучение Java - это просто!");
        String course = study.printCourse();

        System.out.println(course);


        System.out.println("===============");
        System.out.println("Task 2");

        Car car1 = new Car("Красный", 1500.0);
        car1.setName("Toyota");
        car1.displayInfo();

        Car car2 = new Car();
        car2.setName("Honda");
        car2.setWeight(1300.0);
        car2.displayInfo();

        System.out.println("===============");
        System.out.println("Task 3");

        House house1 = new House();
        house1.setHouseData(50, 2010, "Парнас");
        house1.displayInfo();

        House house2 = new House();
        house2.setHouseData(12, 2025, "Шушары");
        house2.displayInfo();

        System.out.println("===============");
        System.out.println("Task 4");

        Tree tree1 = new Tree(150, false, "Дуб");
        tree1.displayInfo();

        Tree tree2 = new Tree(10,  "Сосна");
        tree2.displayInfo();

        new Tree();
    }
}
