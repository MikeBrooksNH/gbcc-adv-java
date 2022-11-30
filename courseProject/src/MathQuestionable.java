//Replace this interface code with your solution to the Chapter 12 zyLab

import java.util.Random;

public interface MathQuestionable {
    Random RANDOM = new Random(5); //DO NOT CHANGE THIS LINE

    // TODO: Add properties and method headers

    final int MAX_SMALL = 25;
    final int MAX_LARGE = 50;
    final int MAX_MULTIPLE = 12;
    final int MAX_BASE = 12;
    final int MAX_EXPONENT = 4;

    public String getQuestion();

    public int getCorrectAnswer();

}
