package creational.builder.MyExampleBuilder;

public class Director {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar() {
        carBuilder.createCar();
        carBuilder.buildWheels();
        carBuilder.buildCarSuspension();
        carBuilder.buildSalonInTheCar();
        carBuilder.buildEngine();
        carBuilder.buildIsItCabriolet();
        carBuilder.buildIsWindowsIsTinted();

        return carBuilder.getCar();
    }
}
