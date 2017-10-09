package behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression IsJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer knows java core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + IsJavaEEDeveloper.interpret("Java Spring"));
    }

    private static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    private static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
