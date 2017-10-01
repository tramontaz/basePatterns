package structural.facade.MyExampleOfFacade;

class PaintMachine {
    void paintCarsBeforeTheyEnd(ConveyorManager ConveyorManager){
        if (ConveyorManager.isCarOnConveyor()){
            System.out.println("Paint machine is painting cars...");
        } else System.out.println("Paint machine does nothing.");
    }
}
