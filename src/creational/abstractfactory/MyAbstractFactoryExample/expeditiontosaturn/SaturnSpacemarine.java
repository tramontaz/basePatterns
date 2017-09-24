package creational.abstractfactory.MyAbstractFactoryExample.expeditiontosaturn;

import creational.abstractfactory.MyAbstractFactoryExample.Spacemarine;

public class SaturnSpacemarine implements Spacemarine {
    @Override
    public void protect() {
        System.out.println("Space marines of Saturn are protecting everyone on saturn...");
    }
}
