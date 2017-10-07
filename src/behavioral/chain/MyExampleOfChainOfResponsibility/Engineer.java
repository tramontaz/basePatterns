package behavioral.chain.MyExampleOfChainOfResponsibility;

public class Engineer extends AccessLevel {

    Engineer(int valueOfAccessLevel) {
        super(valueOfAccessLevel);
    }

    @Override
    void write(String alert) {
        System.out.println("The engineer " + alert);
    }
}
