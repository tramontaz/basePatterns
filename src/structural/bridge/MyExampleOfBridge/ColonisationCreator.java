package structural.bridge.MyExampleOfBridge;

public class ColonisationCreator {
    public static void main(String[] args) {
        SpaceProgram [] spacePrograms = {
                new SpaceProgramOnMars(new Engineer()), new SpaceProgramOnVenera(new SpaceMarine())
        };

        for (SpaceProgram spaceProgram: spacePrograms) {
            spaceProgram.colonize();
        }
    }
}
