package structural.bridge;

public abstract class Program {
    Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    abstract void developProgram();
}
