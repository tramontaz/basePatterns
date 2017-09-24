package creational.factory.MyExampleFactory;

public class SphunxCatFactory implements CatFactory {
    @Override
    public Cat createCat() {
        return new Sphynx();
    }
}
