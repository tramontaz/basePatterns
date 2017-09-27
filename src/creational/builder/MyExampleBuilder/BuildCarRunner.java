package creational.builder.MyExampleBuilder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setCarBuilder(new SUVCarBuilder());

        Car car = director.buildCar();

        System.out.println(car);
    }


}
