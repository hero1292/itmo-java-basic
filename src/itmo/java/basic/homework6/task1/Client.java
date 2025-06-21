package itmo.java.basic.homework6.task1;

public class Client extends Person {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Клиент: " + getFirstName() + " " + getLastName());
        System.out.println("Банк: " + bankName);
    }
}
