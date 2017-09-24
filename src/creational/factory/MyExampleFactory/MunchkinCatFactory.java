package creational.factory.MyExampleFactory;

public class MunchkinCatFactory implements CatFactory {
    @Override
    public Cat createCat() {
        return new Munchkin();
    }
}
