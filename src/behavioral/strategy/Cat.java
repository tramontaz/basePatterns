package behavioral.strategy;

public class Cat {
    private Activity activity;

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    void doIt(){
        activity.doIt();
    }
}
