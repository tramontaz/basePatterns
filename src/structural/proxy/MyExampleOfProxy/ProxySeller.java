package structural.proxy.MyExampleOfProxy;

public class ProxySeller implements Seller{
    private String welcomeSpeech;
    private ShopSeller shopSeller;

    ProxySeller(String welcomeSpeech) {
        this.welcomeSpeech = welcomeSpeech;
    }

    @Override
    public void sell() {
        if (shopSeller == null) {
            shopSeller = new ShopSeller(welcomeSpeech);
        }
        shopSeller.sell();
    }
}
