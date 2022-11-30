//Implement a JavaFX GUI for the math quiz

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import static javafx.application.Platform.exit;

public class MathQuiz extends Application {
    private final int NUMBER_OF_QUESTIONS = 10;
    private final MathQuestion[] questions = new MathQuestion[NUMBER_OF_QUESTIONS];
    private final int[] userAnswers = new int[NUMBER_OF_QUESTIONS];
    private Button scoreButton;   // Button for getting the grade the quiz
    private Button clearAnswersButton;   // Button for clearing all the answers on the form
    private Button exitButton;   // Button for displaying the instructions

    GridPane gridPane = null;   // Positions components within scene

    //@Override
    public void start(Stage applicationStage) {
        // create the container
        BorderPane root = new BorderPane();
        Scene scene;
        // Create Menus
        Menu instructions = new Menu("Instructions");

        // add menus to the menubar
        MenuBar menuBar = new MenuBar();

        // add menu items to the menu(s)
        MenuItem show = new MenuItem("Show");
        menuBar.getMenus().add(instructions);

        // add the menu items
        instructions.getItems().addAll(show);

        // create the gridpane
        gridPane = new GridPane();   // Create an empty pane
        //gridPane.setMinWidth(600.0); // Always want to see the title of the app

        // create the scene and seed it with the menubar
        scene = new Scene(root); // Create scene containing the grid pane

        MathQuiz app = new MathQuiz();

        // Create the buttons on the form
        scoreButton = new Button("Grade Quiz");
        clearAnswersButton = new Button("Clear Answers");
        exitButton = new Button("Exit");

        // get the questions
        app.createQuiz();

        gridPane.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
        gridPane.setHgap(10);                            // Spacing between columns
        gridPane.setVgap(10);                            // Spacing between rows
        gridPane.autosize();

        // Setup fields on the screen to put the answers in
        TextField[] answers = new TextField[NUMBER_OF_QUESTIONS];   // keep track of the answers in a parallel array

        // This is the screen setup for the questions and answers on the quiz
        int gridRow = 0;    // track the row in the grid (need this post for loop)
        for (gridRow = 0; gridRow < NUMBER_OF_QUESTIONS; gridRow++) {
            // building the screen dynamically

            // question text goes in a label that is not editable
            Label question = new Label(app.questions[gridRow].getQuestion()); // create the label and set the label text
            gridPane.add(question, 0, gridRow);  // all questions are in column 0 on the grid row

            // Create a space to answer the questions
            answers[gridRow] = new TextField(); // each answer is a TextField
            answers[gridRow].setMaxWidth(100.0); // Set the width of the answer space

            // add the answer field to the pane
            gridPane.add(answers[gridRow], 1, gridRow);
        }

        //Add a little padding between the text fields and the buttons
        gridRow += 2;

        // add the buttons
        gridPane.add(scoreButton, 0, gridRow);
        gridPane.add(clearAnswersButton, 1, gridRow);
        gridPane.add(exitButton, 2, gridRow);

        // menu handlers
        show.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Quiz Instructions"); // set the title bar title
                alert.setHeaderText("Please follow these instructions"); // set the appropriate info message

                // set the text to display
                alert.setContentText(welcomeAndInstructions());
                alert.setWidth(2000.0);
                alert.showAndWait();

            }
        });

        // Set an event handler to handle button presses
        scoreButton.setOnAction(new EventHandler<ActionEvent>() {
            /* Method is automatically called when an event
               occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                app.gradeQuiz(answers); // all the answers are stored in the text fields on the screen
            }
        });
        clearAnswersButton.setOnAction(new EventHandler<ActionEvent>() {
            // Handler to clear all the answers on the quiz and start over
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
                    answers[i].setText("");
                    answers[i].setStyle("-fx-background-color: White");
                }
            }
        });

        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            // Handler to diplay the instructions
            @Override
            public void handle(ActionEvent event) {
                exit();
            }
        });
        applicationStage.setScene(scene);    // Set window's scene
        applicationStage.setTitle("Math Quiz"); // Set window's title

        // put the menubar on the form
        root.setTop(menuBar);
        // put the rest of the components on the form
        root.setCenter(gridPane);
        // launch the application
        applicationStage.show();             // Display window
    }

    public static void main(String[] args) {
        launch(args); // Launch application
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


    private void gradeQuiz(TextField[] answers) {
        int numberCorrect = 0;
        int answer;
        // TODO: implement the return of wrong answers to show the correct answers with color coded labels.
        int[] wrong = new int[NUMBER_OF_QUESTIONS];
        int howAnswered;

        // Don't need to display the questions again, they are already on the screen
        // We will highlight them
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            answer = questions[i].getCorrectAnswer();
            howAnswered = Integer.parseInt(String.valueOf(answers[i].getText()));
            if (howAnswered == answer) {
                numberCorrect++;
            } else {
                answers[i].setStyle("-fx-background-color: Red");
            }
            wrong[i] = howAnswered;
        }
        // Show the results
        String msg;
        if (numberCorrect > 6)
            msg = "Great Job on a passing score!";
        else
            msg = "You did not receive a passing grade\nSorry, please try again.";

        Alert alert = new Alert(Alert.AlertType.INFORMATION); // create an alert box with as an info message

        alert.setTitle("Quiz Results"); // set the title bar title
        alert.setHeaderText(msg); // set the appropriate info message

        // set the text to display
        alert.setContentText(String.format("\n you got %d questions correct \nYour grade on the quiz is %d\n", numberCorrect, (numberCorrect * 10)));
        alert.setWidth(2000.0);
        alert.showAndWait();

    }
}