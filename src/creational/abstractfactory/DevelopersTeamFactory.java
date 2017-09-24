package creational.abstractfactory;

public interface DevelopersTeamFactory {
    Developer developer();
    Tester tester();
    ProjectManager projectManager();
}
