package creational.builder.MyExampleBuilder;

public class Car {
    String wheels;
    String carSuspension;
    String salonInTheCar;
    String engine;
    boolean isItCabriolet;
    boolean isWindowsIsTinted;

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setCarSuspension(String carSuspension) {
        this.carSuspension = carSuspension;
    }

    public void setSalonInTheCar(String salonInTheCar) {
        this.salonInTheCar = salonInTheCar;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setItCabriolet(boolean itCabrio) {
        isItCabriolet = itCabrio;
    }

    public void setWindowsIsTinted(boolean windowsIsTinted) {
        isWindowsIsTinted = windowsIsTinted;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels='" + wheels + '\'' +
                ", carSuspension='" + carSuspension + '\'' +
                ", salonInTheCar='" + salonInTheCar + '\'' +
                ", engine='" + engine + '\'' +
                ", isItCabrio=" + isItCabriolet +
                ", isWindowsIsTinted=" + isWindowsIsTinted +
                '}';
    }
}
