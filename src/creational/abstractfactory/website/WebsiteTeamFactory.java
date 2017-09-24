package creational.abstractfactory.website;

import creational.abstractfactory.Developer;
import creational.abstractfactory.DevelopersTeamFactory;
import creational.abstractfactory.ProjectManager;
import creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements DevelopersTeamFactory {
    @Override
    public Developer developer() {
        return new PhpDeveloper();
    }

    @Override
    public Tester tester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager projectManager() {
        return new WebsitePM();
    }
}
