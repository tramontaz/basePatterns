package behavioral.chain.MyExampleOfChainOfResponsibility;

class Boss extends AccessLevel {

    Boss(int valueOfAccessLevel) {
        super(valueOfAccessLevel);
    }

    @Override
    void write(String alert) {
        System.out.println("The boss " + alert);
    }
}
