package structural.bridge;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Stock exchange is developing...");
        developer.writeCode();
    }
}
