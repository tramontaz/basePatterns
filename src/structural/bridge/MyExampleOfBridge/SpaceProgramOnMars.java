package structural.bridge.MyExampleOfBridge;

public class SpaceProgramOnMars extends SpaceProgram {

    protected SpaceProgramOnMars(Colonizer colonizer) {
        super(colonizer);
    }

    @Override
    protected void colonize() {
        System.out.println("Space program on Mars is starting...");
        colonizer.colonize();
    }
}
