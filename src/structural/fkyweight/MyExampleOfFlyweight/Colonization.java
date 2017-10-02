package structural.fkyweight.MyExampleOfFlyweight;

import java.util.ArrayList;
import java.util.List;

public class Colonization {
    public static void main(String[] args) {
        ColonizersFactory colonizersFactory = new ColonizersFactory();
        List<Colonizer> colonizers = new ArrayList<>();

        colonizers.add(colonizersFactory.getColonizer("Medic"));
        colonizers.add(colonizersFactory.getColonizer("Medic"));
        colonizers.add(colonizersFactory.getColonizer("Medic"));
        colonizers.add(colonizersFactory.getColonizer("Medic"));
        colonizers.add(colonizersFactory.getColonizer("Medic"));
        colonizers.add(colonizersFactory.getColonizer("Engineer"));
        colonizers.add(colonizersFactory.getColonizer("Engineer"));
        colonizers.add(colonizersFactory.getColonizer("Engineer"));
        colonizers.add(colonizersFactory.getColonizer("Engineer"));
        colonizers.add(colonizersFactory.getColonizer("Engineer"));
        colonizers.add(colonizersFactory.getColonizer("Space marine"));
        colonizers.add(colonizersFactory.getColonizer("Space marine"));
        colonizers.add(colonizersFactory.getColonizer("Space marine"));
        colonizers.add(colonizersFactory.getColonizer("Space marine"));
        colonizers.add(colonizersFactory.getColonizer("Space marine"));

        for (Colonizer colonizer : colonizers) {
            colonizer.colonize();
        }
    }
}
