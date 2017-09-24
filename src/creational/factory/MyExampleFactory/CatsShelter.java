package creational.factory.MyExampleFactory;

public class CatsShelter {
    public static void main(String[] args) {
        CatFactory catFactory = createCatBySpeciality("Munchkin");
        Cat cat = catFactory.createCat();

        cat.singularity();
    }

    static CatFactory createCatBySpeciality(String speciality) {
        switch (speciality) {
            case "Sphunx": return new SphunxCatFactory();
            case "Munchkin": return new MunchkinCatFactory();
            case "MaineCoon": return new MaineCoonCatFactory();
            default: throw new RuntimeException("Unknown speciality: " + speciality);
        }
    }
}
