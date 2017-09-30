package structural.decorator;

public class JavaDeveloper implements Developer {
    @Override
    public String doJob() {
        return "Writes Java code.\t";
    }
}
