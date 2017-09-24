package creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("Php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("Java")) {
            return new  JavaDeveloperFactory();
        } else  if (specialty.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("Php")) {
            return new PhpDeveloperFactory();
        } else throw new RuntimeException("unknown specialty: " + specialty);
    }
}
