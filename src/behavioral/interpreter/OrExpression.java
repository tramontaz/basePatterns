package behavioral.interpreter;

public class OrExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpresson;

    OrExpression(Expression firstExpression, Expression secondExpresson) {
        this.firstExpression = firstExpression;
        this.secondExpresson = secondExpresson;
    }

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) || secondExpresson.interpret(context);
    }
}
