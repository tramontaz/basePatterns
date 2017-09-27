package creational.builder.MyExampleBuilder;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    public abstract void buildWheels();

    public abstract void buildCarSuspension();

    public abstract void buildSalonInTheCar();

    public abstract void buildEngine();

    public abstract void buildIsItCabriolet();

    public abstract void buildIsWindowsIsTinted();

    Car getCar() {
        return car;
    }
}