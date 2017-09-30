package structural.decorator.MyExampleOfDecorator;

public class ExperiencedBoxer extends BoxerDecorator {

    ExperiencedBoxer(Boxer boxer) {
        super(boxer);
    }

    private String beatCross(){
        return "\tBeats the cross.";
    }

    @Override
    public String boxing() {
        return super.boxing() + beatCross();
    }
}
