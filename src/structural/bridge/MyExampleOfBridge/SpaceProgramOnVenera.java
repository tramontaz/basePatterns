package structural.bridge.MyExampleOfBridge;

import structural.bridge.Program;

public class SpaceProgramOnVenera extends SpaceProgram {

    protected SpaceProgramOnVenera(Colonizer colonizer) {
        super(colonizer);
    }

    @Override
    protected void colonize() {
        System.out.println("The Venera is colonizing by colonizers...");
        colonizer.colonize();
    }
}
