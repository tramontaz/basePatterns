package structural.decorator.MyExampleOfDecorator;

public class BoxerDecorator implements Boxer {
    private Boxer boxer;

    BoxerDecorator(Boxer boxer) {
        this.boxer = boxer;
    }

    @Override
    public String boxing() {
        return boxer.boxing();
    }
}
