package creational.prototype.MyExampleOfProtorype;

import creational.prototype.Copyble;

public class URL implements Copyble {

    String name;
    String url;

    public URL(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "URL{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new URL(name, url);
    }
}
