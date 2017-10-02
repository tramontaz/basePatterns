package structural.fkyweight.MyExampleOfFlyweight;

public class Engineer implements Colonizer {
    @Override
    public void colonize() {
        System.out.println("Engineer is building structures...");
    }
}
