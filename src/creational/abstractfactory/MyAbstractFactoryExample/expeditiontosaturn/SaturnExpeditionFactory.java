package creational.abstractfactory.MyAbstractFactoryExample.expeditiontosaturn;

import creational.abstractfactory.MyAbstractFactoryExample.Colonizer;
import creational.abstractfactory.MyAbstractFactoryExample.Engineer;
import creational.abstractfactory.MyAbstractFactoryExample.IntergalacticExpeditionFactory;
import creational.abstractfactory.MyAbstractFactoryExample.Spacemarine;

public class SaturnExpeditionFactory implements IntergalacticExpeditionFactory {
    @Override
    public Colonizer colonizer() {
        return new SaturnColonizer();
    }

    @Override
    public Engineer engineer() {
        return new SaturnEngineer();
    }

    @Override
    public Spacemarine spacemarine() {
        return new SaturnSpacemarine();
    }
}
