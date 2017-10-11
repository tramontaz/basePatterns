package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    private List<String> vacancions = new ArrayList<>();

    private List<Observer> subscribers = new ArrayList<>();

    void addVacancy(String vacancy) {
        this.vacancions.add(vacancy);
        notifyObservers();
    }

    void removeVacancy(String vacancy) {
        this.vacancions.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) observer.handleEvent(this.vacancions);
    }
}
