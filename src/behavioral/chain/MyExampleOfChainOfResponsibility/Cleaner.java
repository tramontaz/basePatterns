package behavioral.chain.MyExampleOfChainOfResponsibility;

class Cleaner extends AccessLevel {

    Cleaner(int valueOfAccessLevel) {
        super(valueOfAccessLevel);
    }

    @Override
    void write(String alert) {
        System.out.println("Cleaner has this access level: " + alert);
    }
}
