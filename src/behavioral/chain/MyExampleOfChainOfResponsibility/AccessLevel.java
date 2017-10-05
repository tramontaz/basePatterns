package behavioral.chain.MyExampleOfChainOfResponsibility;

abstract class AccessLevel {
    private int valueOfAccessLevel;
    private AccessLevel nextAccessLevel;

    AccessLevel(int valueOfAccessLevel) {
        this.valueOfAccessLevel = valueOfAccessLevel;
    }

    void setNextAccessLevel(AccessLevel nextAccessLevel) {
        this.nextAccessLevel = nextAccessLevel;
    }

    void accessManager(String alert, int level) {
        if (valueOfAccessLevel >= level) write(alert);
        if (nextAccessLevel != null) nextAccessLevel.accessManager(alert, level);
    }

    abstract void write(String alert);
}
