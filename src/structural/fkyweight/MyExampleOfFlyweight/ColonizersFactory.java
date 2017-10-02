package structural.fkyweight.MyExampleOfFlyweight;

import java.util.HashMap;
import java.util.Map;

class ColonizersFactory {
    private final Map<String, Colonizer> colonizers = new HashMap<>();

    Colonizer getColonizer(String specialty) {
        Colonizer colonizer = colonizers.get(specialty);
        if (colonizer == null) {
            switch (specialty) {
                case "Engineer":
                    System.out.println("Sending an engineer...");
                    colonizer = new Engineer();
                    break;
                case "Medic":
                    System.out.println("Sending a medic...");
                    colonizer = new Medic();
                    break;
                case "Space marine":
                    System.out.println("Sending a space marine...");
                    colonizer = new SpaceMarine();
                    break;
            }
            colonizers.put(specialty, colonizer);
        }
        return colonizer;
    }
}
