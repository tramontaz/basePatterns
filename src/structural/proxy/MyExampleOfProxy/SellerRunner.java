package structural.proxy.MyExampleOfProxy;

public class SellerRunner {
    public static void main(String[] args) {
        Seller seller = new ProxySeller("Hello! Should I help you?");

        seller.sell();
    }
}
