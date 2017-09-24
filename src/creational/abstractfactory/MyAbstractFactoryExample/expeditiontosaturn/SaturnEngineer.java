package creational.abstractfactory.MyAbstractFactoryExample.expeditiontosaturn;

import creational.abstractfactory.MyAbstractFactoryExample.Engineer;

public class SaturnEngineer implements Engineer{
    @Override
    public void engineering() {
        System.out.println("Engineer of Saturn are engineering things...");
    }
}
