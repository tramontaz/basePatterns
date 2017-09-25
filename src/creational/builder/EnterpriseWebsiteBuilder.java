package creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.WORDPRES);
    }

    @Override
    public void buildPrice() {
        website.setPrice(10000);
    }
}
