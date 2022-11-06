//Replace this class code with your solution to the Chapter 12 zyLab

public abstract class MathQuestion implements MathQuestionable {
    // TODO: Declare private member integer constants x and y
    private final int x;
    private final int y;

    // TODO: Define a default (no parameters) constructor that assigns
    // x to RANDOM.nextInt(MAX_LARGE) + 1
    // y to RANDOM.nextInt(MAX_SMALL) + 1
    public MathQuestion() {
        this.x = RANDOM.nextInt(MAX_LARGE) + 1;
        this.y = RANDOM.nextInt(MAX_SMALL) + 1;
    }

    // TODO: Define a parameterized constructor that accepts two integer values
    // The first parameter must be assigned to x
    // The second parameter must be assigned to y
    public MathQuestion(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // TODO: Define public accessor methods getX() and getY()
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
    // A video walk-through will be provided for how to write the code for this class
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
    private static  int _x = RANDOM.nextInt(MAX_LARGE) + 1;
    private static  int _y = RANDOM.nextInt(_x) + 1;

    // TODO: Define default constructor to call parent class constructor and passing _x and _y as arguments
    // You will also need to reassign new random values to both _x and _y as shown in the initial assignment statements
    public DivisionQuestion() {
        super(_x, _y);
        this._x = RANDOM.nextInt(MAX_LARGE) + 1;
        this._y = RANDOM.nextInt(_x) + 1;
    }


    // TODO: Define a parameterized constructor that accepts two integers and passes these in a call to the parent constructor
    public DivisionQuestion(int x, int y) {
        super(x, y);
    }

    // TODO: Define getQuestion that returns a String and makes a call to the parent getQuestion method.
    // You will need to pass OperationType.DIVIDE as the argument

    public String getQuestion() {
        return super.getQuestion(OperationType.DIVIDE);
    }

    // TODO: Define getCorrectAnswer that returns an integer result of x / y (this is not as simple as it looks!)
    public int getCorrectAnswer() {
        return super.getX() / super.getY();
    }

}

class ExponentQuestion extends MathQuestion {
    private static  int _x = RANDOM.nextInt(MAX_BASE) + 1;
    private static  int _y = RANDOM.nextInt(MAX_EXPONENT);

    // TODO: Define default constructor to call parent class constructor and passing _x and _y as arguments
    // You will also need to reassign new random values to both _x and _y as shown in the initial assignment statements
    public ExponentQuestion() {
        super(_x, _y);
        this._x = RANDOM.nextInt(MAX_BASE) + 1;
        this._y = RANDOM.nextInt(MAX_EXPONENT) + 1;
    }

    // TODO: Define a parameterized constructor that accepts two integers and passes these in a call to the parent constructor
    public ExponentQuestion(int x, int y) {
        super(x, y);
    }

    // TODO: Define getQuestion that returns a String and makes a call to the parent getQuestion method.
    // You will need to pass OperationType.EXPONENT as the argument
    public String getQuestion() {
        return super.getQuestion(OperationType.EXPONENT);
    }

    // TODO: Define getCorrectAnswer that returns an integer result of Math.pow(x, y) (this is not as simple as it looks!)
    public int getCorrectAnswer() {
        return (int) Math.pow(super.getX(), super.getY());
    }

}

class ModuloQuestion extends MathQuestion {
    private static  int _x = RANDOM.nextInt(MAX_LARGE) + 1;
    private static  int _y = RANDOM.nextInt(_x) + 1;

    // TODO: Define default constructor to call parent class constructor and passing _x and _y as arguments
    // You will also need to reassign new random values to both _x and _y as shown in the initial assignment statements
    public ModuloQuestion() {
        super(_x, _y);
        this._x = RANDOM.nextInt(MAX_LARGE) + 1;
        this._y = RANDOM.nextInt(_x) + 1;
    }

    // TODO: Define a parameterized constructor that accepts two integers and passes these in a call to the parent constructor
    public ModuloQuestion(int x, int y) {
        super(x, y);
    }

    // TODO: Define getQuestion that returns a String and makes a call to the parent getQuestion method.
    // You will need to pass OperationType.MODULO as the argument
    public String getQuestion() {
        return super.getQuestion(OperationType.MODULO);
    }

    // TODO: Define getCorrectAnswer that returns an integer result of x % y (this is not as simple as it looks!)
    public int getCorrectAnswer() {
        return (int) super.getX() % super.getY();
    }


}

class MultiplicationQuestion extends MathQuestion {
    private static  int _x = RANDOM.nextInt(MAX_MULTIPLE) + 1;
    private static  int _y = RANDOM.nextInt(MAX_MULTIPLE) + 1;

    // TODO: Define default constructor to call parent class constructor and passing _x and _y as arguments
    // You will also need to reassign new random values to both _x and _y as shown in the initial assignment statements
    public MultiplicationQuestion() {
        super(_x, _y);
        this._x = RANDOM.nextInt(MAX_MULTIPLE) + 1;
        this._y = RANDOM.nextInt(MAX_MULTIPLE) + 1;
    }


    // TODO: Define a parameterized constructor that accepts two integers and passes these in a call to the parent constructor
    public MultiplicationQuestion(int x, int y) {
        super(x, y);
    }

    // TODO: Define getQuestion that returns a String and makes a call to the parent getQuestion method.
    // You will need to pass OperationType.MULTIPLY as the argument
    public String getQuestion() {
        return super.getQuestion(OperationType.MULTIPLY);
    }

    // TODO: Define getCorrectAnswer that returns an integer result of x * y (this is not as simple as it looks!)
    public int getCorrectAnswer() {
        return (int) super.getX() * super.getY();
    }

}

class SubtractionQuestion extends MathQuestion {
    private static  int _x = RANDOM.nextInt(MAX_SMALL) + MAX_SMALL + 1;
    private static  int _y = RANDOM.nextInt(MAX_SMALL) + 1;

    // TODO: Define default constructor to call parent class constructor and passing _x and _y as arguments
    // You will also need to reassign new random values to both _x and _y as shown in the initial assignment statements
    public SubtractionQuestion() {
        super(_x, _y);
        this._x = RANDOM.nextInt(MAX_SMALL) + 1;
        this._y = RANDOM.nextInt(MAX_SMALL) + 1;
    }


    // TODO: Define a parameterized constructor that accepts two integers and passes these in a call to the parent constructor
    public SubtractionQuestion(int x, int y) {
        super(x, y);
    }

    // TODO: Define getQuestion that returns a String and makes a call to the parent getQuestion method.
    // You will need to pass OperationType.SUBTRACT as the argument
    public String getQuestion() {
        return super.getQuestion(OperationType.SUBTRACT);
    }

    // TODO: Define getCorrectAnswer that returns an integer result of x - y (this is not as simple as it looks!)
    public int getCorrectAnswer() {
        return (int) super.getX() - super.getY();
    }

}

