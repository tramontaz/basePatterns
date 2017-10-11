package behavioral.state;

public class Cat {
    private Activity activity;

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    void changeActivity() {
        if (activity instanceof Sleep) setActivity(new Eating());
        else if (activity instanceof Eating) setActivity(new Playing());
        else if (activity instanceof Playing) setActivity(new Haunting());
        else if (activity instanceof Haunting) setActivity(new Pooping());
        else if (activity instanceof Pooping) setActivity(new SayingPurPurPur());
        else if (activity instanceof SayingPurPurPur) setActivity(new Sleep());
    }

    void doIt(){
        activity.doIt();
    }
}
