package creational.builder.MyExampleBuilder;

public class SUVCarBuilder extends CarBuilder {
    @Override
    public void buildWheels() {
        car.setWheels("SUV wheels");
    }

    @Override
    public void buildCarSuspension() {
        car.setCarSuspension("SUV suspension");
    }

    @Override
    public void buildSalonInTheCar() {
        car.setSalonInTheCar("Spartan car salon");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Diesel engine");
    }

    @Override
    public void buildIsItCabriolet() {
        car.setItCabriolet(false);
    }

    @Override
    public void buildIsWindowsIsTinted() {
        car.setWindowsIsTinted(false);
    }
}
