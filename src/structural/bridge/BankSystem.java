package structural.bridge;

public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Bank system is developing...");
        developer.writeCode();
    }
}
