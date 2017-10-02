package structural.fkyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DevelopersFactory developersFactory = new DevelopersFactory();
        List<Developer> developers = new ArrayList<>();


        developers.add(developersFactory.getDevelopersBySpecialty("java"));
        developers.add(developersFactory.getDevelopersBySpecialty("java"));
        developers.add(developersFactory.getDevelopersBySpecialty("java"));
        developers.add(developersFactory.getDevelopersBySpecialty("java"));
        developers.add(developersFactory.getDevelopersBySpecialty("java"));
        developers.add(developersFactory.getDevelopersBySpecialty("java"));
        developers.add(developersFactory.getDevelopersBySpecialty("java"));
        developers.add(developersFactory.getDevelopersBySpecialty("java"));
        developers.add(developersFactory.getDevelopersBySpecialty("java"));


        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));
        developers.add(developersFactory.getDevelopersBySpecialty("c++"));


        for (Developer developer : developers) {
            developer.writeCode();
        }

    }
}
