import java.util.Random;

public interface MathQuestionable {
    Random RANDOM = new Random(5); //DO NOT CHANGE THIS LINE


    /*
Declare (but do not define) the method getQuestion() that has an empty parameter list and returns a String.
Declare (but do not define) the method getCorrectAnswer() that has an empty parameter list and returns an integer.

     */
    // TODO: Add properties and method headers

     final int MAX_SMALL = 25;
     final int MAX_LARGE = 50;
     final int MAX_MULTIPLE = 12;
     final int MAX_BASE = 12;
     final int MAX_EXPONENT = 4;


    //integer constants x and y
    //int x = 0;
    //int y = 0;

    public String getQuestion();
    public int getCorrectAnswer();


}
