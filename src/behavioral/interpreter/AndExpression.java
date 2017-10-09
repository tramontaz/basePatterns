package behavioral.interpreter;

public class AndExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    AndExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) && secondExpression.interpret(context);
    }
}
