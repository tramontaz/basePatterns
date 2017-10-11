package behavioral.template;

public class Newspaper {
    public static void main(String[] args) {
        NewsTemplate salmon = new TopicAboutSalmon();
        NewsTemplate carp = new TopicAboutCarp();

        salmon.showPage();
        System.out.println("\n===============================================\n");
        carp.showPage();
    }
}
