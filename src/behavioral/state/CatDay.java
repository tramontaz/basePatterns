package behavioral.state;

public class CatDay {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Cat fidel = new Cat();
        String[] week = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        fidel.setActivity(activity);

        for (String day : week) {
            System.out.println(day + ":");
            System.out.println("");
            for (int i = 0; i < 6 ; i++) {
                fidel.doIt();
                fidel.changeActivity();
            }
            System.out.println();
        }
    }
}
