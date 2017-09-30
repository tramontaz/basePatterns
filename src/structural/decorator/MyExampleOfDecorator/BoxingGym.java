package structural.decorator.MyExampleOfDecorator;

public class BoxingGym {
    public static void main(String[] args) {
        Boxer boxer = new ProfessionalBoxer(new ExperiencedBoxer(new Beginner()));

        System.out.println(boxer.boxing());
    }
}
