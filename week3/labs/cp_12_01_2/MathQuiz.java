import java.util.Scanner;

public class MathQuiz {
    private final int NUMBER_OF_QUESTIONS = 10;
    private final MathQuestion[] questions = new MathQuestion[NUMBER_OF_QUESTIONS];
    private final int[] userAnswers = new int[NUMBER_OF_QUESTIONS];

    public static void main(String[] args) {
        MathQuiz app = new MathQuiz();
        System.out.println(app.welcomeAndInstructions());
        app.createQuiz();
        app.administerQuiz();
        app.gradeQuiz();
    }

    private String welcomeAndInstructions() {
        return "Welcome to Math Quiz!\n" +
               "There are currently six types of math questions possible:\n" +
               "Addition, Subtraction, Multiplication, Exponents, Division, and Modulo.\n" +
               "The answer to each question will always be an integer.\n\n" +
               "Good luck!\n";
    }

    private void createQuiz() {
        int i = 0;
        OperationType op;

        while (i < NUMBER_OF_QUESTIONS) {
            op = OperationType.getRandom();

            switch (op) {
                case ADD:
                    questions[i++] = new AdditionQuestion();
                    break;
                case SUBTRACT:
                    questions[i++] = new SubtractionQuestion();
                    break;
                case MULTIPLY:
                    questions[i++] = new MultiplicationQuestion();
                    break;
                case EXPONENT:
                    questions[i++] = new ExponentQuestion();
                    break;
                case DIVIDE:
                    questions[i++] = new DivisionQuestion();
                    break;
                case MODULO:
                    questions[i++] = new ModuloQuestion();
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    private void administerQuiz() {
        Scanner scanner = new Scanner(System.in);
        int questionNum = 1;
        for (MathQuestion q : questions) { //POLYMORPHISM!!
            System.out.printf("Question %2d:  %s ", questionNum, q.getQuestion());
            userAnswers[questionNum - 1] = scanner.nextInt();
            questionNum++;
        }
    }

    private void gradeQuiz() {
        int numberCorrect = 0;
        String question;
        int answer;

        System.out.println("\nHere are the correct answers:\n");

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            question = questions[i].getQuestion();
            answer = questions[i].getCorrectAnswer();
            System.out.printf("Question number %d:\n    %s\n", i + 1, question);
            System.out.printf("    Correct answer:  %d\n", answer);
            if (userAnswers[i] == answer) {
                System.out.println("    You were CORRECT.");
                numberCorrect++;
            } else {
                System.out.printf("    You said %d, which is INCORRECT.\n", userAnswers[i]);
            }
        }

        System.out.printf("\nYou got %d questions correct.\n", numberCorrect);
        System.out.printf("Your grade on the quiz is %d\n", (numberCorrect * 10));
    }
}

