package behavioral.strategy;

public class CatDay {
    public static void main(String[] args) {
        Cat fidel = new Cat();

        fidel.setActivity(new Sleep());
        fidel.doIt();

        fidel.setActivity(new Eating());
        fidel.doIt();

        fidel.setActivity(new Playing());
        fidel.doIt();

        fidel.setActivity(new Pooping());
        fidel.doIt();

        fidel.setActivity(new SayingPurPurPur());
        fidel.doIt();
    }
}
