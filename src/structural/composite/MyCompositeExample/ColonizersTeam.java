package structural.composite.MyCompositeExample;

import java.util.ArrayList;

class ColonizersTeam {
    private ArrayList<Colonizer> team = new ArrayList<>();

    void addColonizer(Colonizer colonizer) {
        team.add(colonizer);
    }

    void removeColonizer(Colonizer colonizer) {
        team.remove(colonizer);
    }

    void createColonizationProgram(){
        System.out.println("Colonization program is starting...\n");

        for (Colonizer colonizer : team) {
            colonizer.colonize();
        }
    }
}
