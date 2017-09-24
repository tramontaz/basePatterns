package creational.abstractfactory.MyAbstractFactoryExample.expeditiontosaturn;

import creational.abstractfactory.MyAbstractFactoryExample.Colonizer;

public class SaturnColonizer implements Colonizer {
    @Override
    public void colonization() {
        System.out.println("Colonizer of Saturn discovers the Saturn...");
    }
}
