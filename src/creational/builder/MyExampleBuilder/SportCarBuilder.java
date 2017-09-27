package creational.builder.MyExampleBuilder;

public class SportCarBuilder extends CarBuilder {
    @Override
    public void buildWheels() {
        car.setWheels("sport wheels");
    }

    @Override
    public void buildCarSuspension() {
        car.setCarSuspension("sport suspension");
    }

    @Override
    public void buildSalonInTheCar() {
        car.setSalonInTheCar("Rich car salon");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Sport engine");
    }

    @Override
    public void buildIsItCabriolet() {
        car.setItCabriolet(true);
    }

    @Override
    public void buildIsWindowsIsTinted() {
        car.setWindowsIsTinted(true);
    }
}
