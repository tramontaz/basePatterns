package creational.factory.MyExampleFactory;

public class MaineCoonCatFactory implements CatFactory {
    @Override
    public Cat createCat() {
        return new MaineCoon();
    }
}
