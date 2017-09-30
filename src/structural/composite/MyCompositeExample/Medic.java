package structural.composite.MyCompositeExample;

public class Medic implements Colonizer {
    @Override
    public void colonize() {
        System.out.println("Doctor is watching for colonizer's health...");
    }
}
