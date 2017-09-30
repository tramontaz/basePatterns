package structural.adapter.MyExampleOfAdapter;

public class TranslatorRunner {
    public static void main(String[] args) {
        Translator englishNativeSpeaker = new EnglishSpeakerAdapter();
        englishNativeSpeaker.sayHello();
        englishNativeSpeaker.sayYes();
        englishNativeSpeaker.sayNo();
        englishNativeSpeaker.sayGoodbye();
    }
}
