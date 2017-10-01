package structural.facade.MyExampleOfFacade;

class WorkingDay {
    private Conveyor conveyor = new Conveyor();
    private ConveyorManager conveyorManager = new ConveyorManager();
    private PaintMachine paintMachine = new PaintMachine();

    void work(){
        conveyor.startConveyor();
        conveyorManager.setCarOnConveyor();
        paintMachine.paintCarsBeforeTheyEnd(conveyorManager);
    }
}
