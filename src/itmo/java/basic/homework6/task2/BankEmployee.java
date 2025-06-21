package itmo.java.basic.homework6.task2;

public class BankEmployee extends Person implements InfoPrintable {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Работник банка: " + getFirstName() + " " + getLastName());
        System.out.println("Банк: " + bankName);
    }
}
