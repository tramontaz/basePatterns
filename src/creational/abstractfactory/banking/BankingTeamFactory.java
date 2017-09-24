package creational.abstractfactory.banking;

import creational.abstractfactory.Developer;
import creational.abstractfactory.DevelopersTeamFactory;
import creational.abstractfactory.ProjectManager;
import creational.abstractfactory.Tester;

public class BankingTeamFactory implements DevelopersTeamFactory {
    @Override
    public Developer developer() {
        return new JavaDeveloper();
    }

    @Override
    public Tester tester() {
        return new QATester();
    }

    @Override
    public ProjectManager projectManager() {
        return new BankingPM();
    }
}
