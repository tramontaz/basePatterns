package structural.facade.MyExampleOfFacade;

class ConveyorManager {
    private boolean carOnConveyor;

    boolean isCarOnConveyor() {
        return carOnConveyor;
    }

    void setCarOnConveyor() {
        System.out.println("Cars on Conveyor...");
        carOnConveyor = true;
    }

    void removeCarFromConveyor() {
        System.out.println("Cars is removed from Conveyor");
        carOnConveyor = false;
    }
}
