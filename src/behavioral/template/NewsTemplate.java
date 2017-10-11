package behavioral.template;

abstract class NewsTemplate {
    void showPage() {
        System.out.println("Introduction");
        mainPart();
        System.out.println("Conclusion");
    }

    abstract void mainPart();
}
