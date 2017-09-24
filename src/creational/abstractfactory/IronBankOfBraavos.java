package creational.abstractfactory;

import creational.abstractfactory.banking.BankingTeamFactory;

public class IronBankOfBraavos {

    public static void main(String[] args) {
        DevelopersTeamFactory developersTeamFactory = new BankingTeamFactory();
        Developer developer = developersTeamFactory.developer();
        Tester tester = developersTeamFactory.tester();
        ProjectManager projectManager = developersTeamFactory.projectManager();

        System.out.println("'Iron Bank of Braavos' project is starting...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
