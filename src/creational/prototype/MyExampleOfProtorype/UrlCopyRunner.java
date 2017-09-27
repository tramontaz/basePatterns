package creational.prototype.MyExampleOfProtorype;

public class UrlCopyRunner {
    public static void main(String[] args) {
        URL url = new URL("google", "google.com");

        System.out.println(url);

        URLFactory urlFactory = new URLFactory(url);
        URL copyURL = urlFactory.cloneURL();

        System.out.println("\n================================================================================\n");
        System.out.println(copyURL);
    }
}
