import java.util.*;

public abstract class MathQuestion implements MathQuestionable {
    private final int  x;
    private final int  y;
    //private static Random random = new Random();

    public MathQuestion() {
        this.x = RANDOM.nextInt(MAX_LARGE) + 1;
        this.y = RANDOM.nextInt(MAX_SMALL) + 1;
    }

    public MathQuestion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getQuestion(OperationType op) {
        return "What is " + x + ' ' + op.getSymbol() + ' ' + y + '?';
    }

}

class AdditionQuestion extends MathQuestion {
    // This class definition should give you a basic idea for how to define the other
    // operation classes. Keep in mind the other characteristics each operation might have.
    public AdditionQuestion() {
        super();
    }

    public AdditionQuestion(int px, int py) {
        super(px, py);
    }

    public String getQuestion() {
        return super.getQuestion(OperationType.ADD);
    }

    public int getCorrectAnswer() {
        return getX() + getY();
    }
}

class DivisionQuestion extends MathQuestion {
    private static int _x = RANDOM.nextInt(MAX_LARGE) + 1;
    private static int _y = RANDOM.nextInt(_x) + 1;

    public DivisionQuestion() {
        super(_x, _y);
        _x = RANDOM.nextInt(MAX_LARGE) + 1;
        _y = RANDOM.nextInt(_x) + 1;
    }

    public DivisionQuestion(int x, int y) {
        super(x, y);
    }

    @Override
    public String getQuestion() {
        return super.getQuestion(OperationType.DIVIDE);
    }

    @Override
    public int getCorrectAnswer() {
        return super.getX() / super.getY();
    }
}

class ExponentQuestion extends MathQuestion {
    private static int _x = RANDOM.nextInt(MAX_BASE) + 1;
    private static int _y = RANDOM.nextInt(MAX_EXPONENT) + 1;

    public ExponentQuestion() {
        super(_x, _y);
        _x = RANDOM.nextInt(MAX_BASE) + 1;
        _y = RANDOM.nextInt(MAX_EXPONENT) + 1;
    }

    public ExponentQuestion(int x, int y) {
        super(x, y);
    }

    @Override
    public String getQuestion() {
        return super.getQuestion(OperationType.EXPONENT);
    }

    @Override
    public int getCorrectAnswer() {
        return (int) Math.pow(super.getX(), super.getY());
    }

}

class ModuloQuestion extends MathQuestion {
    private static int _x = RANDOM.nextInt(MAX_LARGE) + 1;
    private static int _y = RANDOM.nextInt(_x) + 1;

    public ModuloQuestion() {
        super();
        _x = RANDOM.nextInt(MAX_LARGE) + 1;
        _y = RANDOM.nextInt(_x) + 1;
    }

    public ModuloQuestion(int x, int y) {
        super(x, y);
    }

    @Override
    public String getQuestion() {
        return super.getQuestion(OperationType.MODULO);
    }

    @Override
    public int getCorrectAnswer() {
        return (int) super.getX() % super.getY();
    }

}

class MultiplicationQuestion extends MathQuestion {
    private static int _x = RANDOM.nextInt(MAX_MULTIPLE) + 1;
    private static int _y = RANDOM.nextInt(MAX_MULTIPLE) + 1;

    public MultiplicationQuestion() {
        super();
        _x = RANDOM.nextInt(MAX_MULTIPLE) + 1;
        _y = RANDOM.nextInt(MAX_MULTIPLE) + 1;
    }

    public MultiplicationQuestion(int x, int y) {
        super(x, y);
    }

    @Override
    public String getQuestion() {
        return super.getQuestion(OperationType.MULTIPLY);
    }

    @Override
    public int getCorrectAnswer() {
        return (int) super.getX() * super.getY();
    }

}

class SubtractionQuestion extends MathQuestion {
    private static int _x = RANDOM.nextInt(MAX_SMALL) + 1;
    private static int _y = RANDOM.nextInt(MAX_SMALL) + 1;

    public SubtractionQuestion() {
        super();
        _x = RANDOM.nextInt(MAX_SMALL) + 1;
        _y = RANDOM.nextInt(MAX_SMALL) + 1;
    }

    public SubtractionQuestion(int x, int y) {
        super(x, y);
    }

    @Override
    public String getQuestion() {
        return super.getQuestion(OperationType.SUBTRACT);
    }

    @Override
    public int getCorrectAnswer() {
        return (int) super.getX() - super.getY();
    }

}

