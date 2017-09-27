package creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project("Project", 1, "new Sourcecode();");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project clone = projectFactory.cloneProject();

        System.out.println("\n=================================================================\n");

        System.out.println(clone);
    }


}
