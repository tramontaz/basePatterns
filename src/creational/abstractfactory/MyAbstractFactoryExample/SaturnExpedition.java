package creational.abstractfactory.MyAbstractFactoryExample;

import creational.abstractfactory.MyAbstractFactoryExample.expeditiontosaturn.SaturnExpeditionFactory;

public class SaturnExpedition {
    public static void main(String[] args) {
        IntergalacticExpeditionFactory intergalacticExpeditionFactory = new SaturnExpeditionFactory();
        Colonizer colonizer = intergalacticExpeditionFactory.colonizer();
        Engineer engineer = intergalacticExpeditionFactory.engineer();
        Spacemarine spacemarine = intergalacticExpeditionFactory.spacemarine();

        System.out.println("Colonization process on Saturn is starting...");
        colonizer.colonization();
        engineer.engineering();
        spacemarine.protect();
    }
}
