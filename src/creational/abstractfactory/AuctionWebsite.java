package creational.abstractfactory;

import creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionWebsite {
    public static void main(String[] args) {
        DevelopersTeamFactory developersTeamFactory = new WebsiteTeamFactory();
        Developer developer = developersTeamFactory.developer();
        Tester tester = developersTeamFactory.tester();
        ProjectManager projectManager = developersTeamFactory.projectManager();

        System.out.println("Auction website is starting...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
