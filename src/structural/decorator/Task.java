package structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.doJob());
    }
}
