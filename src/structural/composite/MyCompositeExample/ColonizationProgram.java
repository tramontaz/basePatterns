package structural.composite.MyCompositeExample;

public class ColonizationProgram {
    public static void main(String[] args) {
        ColonizersTeam team = new ColonizersTeam();

        Colonizer engineer = new Engineer();
        Colonizer spaceMarine = new SpaceMarine();
        Colonizer medic = new Medic();

        team.addColonizer(engineer);
        team.addColonizer(spaceMarine);
        team.addColonizer(medic);

        team.createColonizationProgram();
    }
}
