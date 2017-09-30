package structural.bridge.MyExampleOfBridge;

public abstract class SpaceProgram {
    Colonizer colonizer;

    protected SpaceProgram(Colonizer colonizer) {
        this.colonizer = colonizer;
    }

    abstract void colonize();
}
