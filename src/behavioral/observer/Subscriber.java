package behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies: " + vacancies +
                "\n=====================================================================\n");
    }
}
