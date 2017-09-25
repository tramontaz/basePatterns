package creational.builder;

public class VisitCartWebsite extends WebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Visit cart website");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(500);
    }
}
