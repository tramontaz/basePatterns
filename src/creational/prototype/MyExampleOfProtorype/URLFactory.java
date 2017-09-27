package creational.prototype.MyExampleOfProtorype;

public class URLFactory {
    URL url;

    public URLFactory(URL url) {
        this.url = url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    URL cloneURL() {
        return (URL) url.copy();
    }
}
