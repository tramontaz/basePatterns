package behavioral.chain.MyExampleOfChainOfResponsibility;

public class Engineer extends AccessLevel {

    Engineer(int valueOfAccessLevel) {
        super(valueOfAccessLevel);
    }

    @Override
    void write(String alert) {
        System.out.println("Engineer has this access level: " + alert);
    }
}
