package itmo.java.basic.homework6.task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван", "Иванов", "Сбербанк");
        BankEmployee employee = new BankEmployee("Петр", "Петров", "Сбербанк");

        client.printInfo();
        System.out.println("-----------");
        employee.printInfo();
    }
}
