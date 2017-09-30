package structural.adapter.MyExampleOfAdapter;

public class EnglishSpeakerAdapter extends EnglishSpeaker implements Translator {
    @Override
    public void sayHello() {
        greeting();
    }

    @Override
    public void sayYes() {
        agree();
    }

    @Override
    public void sayNo() {
        refuse();
    }

    @Override
    public void sayGoodbye() {
        bidFarewell();
    }
}
