package structural.composite;

import java.util.ArrayList;
import java.util.List;

class Team {
    private List<Developer> team = new ArrayList<>();

    void addDeveloper(Developer developer) {
        team.add(developer);
    }

    void removeDeveloper(Developer developer) {
        team.remove(developer);
    }

    void createProject(){
        System.out.println("Project is creating...\n");

        for (Developer developer: team){
            developer.writeCode();
        }
    }
}
