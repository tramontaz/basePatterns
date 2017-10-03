package structural.proxy.MyExampleOfProxy;

public class ShopSeller implements Seller{
    private String welcomeSpeech;

    private void comeCloser() {
        System.out.println("Shop seller coming closer...");
    }

    ShopSeller(String welcomeSpeech) {
        this.welcomeSpeech = welcomeSpeech;
        comeCloser();
    }

    @Override
    public void sell() {
        System.out.println("Shop seller says: " + welcomeSpeech + "...");
    }
}
