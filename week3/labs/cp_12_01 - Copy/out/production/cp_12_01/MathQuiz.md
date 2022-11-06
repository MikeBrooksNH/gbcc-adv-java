#12.5 Math Quiz

##Create a basic math quiz program that creates a set of 10 randomly generated math questions for the following operations:

Addition
Subtraction
Multiplication
Division
Modulo
Exponent
The following source files are already complete and CANNOT be changed:

MathQuiz.java (contains the main() method)
OperationType.java (defines an enumeration for valid math operations and related functionality)
The following source files are incomplete and need to be coded to meet the indicated requirements:

MathQuestionable.java
MathQuestionable is an interface, and you will need to define each of the following elements to make them available to all classes that implement the interface (in this case, anything that is a MathQuestion):
A Random object called RANDOM has already been declared and assigned, and you must not change this assignment in any way.
Declare and assign an interface integer called MAX_SMALL and assign it the value 25.
Declare and assign an interface integer called MAX_LARGE and assign it the value 50.
Declare and assign an interface integer called MAX_MULTIPLE and assign it the value 12.
Declare and assign an interface integer called MAX_BASE and assign it the value 12.
Declare and assign an interface integer called MAX_EXPONENT and assign it the value 4.
Declare (but do not define) the method getQuestion() that has an empty parameter list and returns a String.
Declare (but do not define) the method getCorrectAnswer() that has an empty parameter list and returns an integer.
MathQuestion.java
MathQuestion is an abstract class, and the required derived classes (AdditionQuestion, DivisionQuestion, ExponentQuestion, ModuloQuestion, MultiplicationQuestion, and SubtractionQuestion) already have starting code defined within the MathQuestion source file. A public method to generate a math question as a string (getQuestion()) has already been defined in the MathQuestion class.
The MathQuestion class must define the following:
Private member integer constants x and y.
A no-argument (default) constructor that assigns x to RANDOM.nextInt(MAX_LARGE) + 1 and y to RANDOM.nextInt(MAX_SMALL) + 1.
A parameterized constructor that accepts two integer values and assigns the first to x and the second to y.
Appropriate public accessor methods getX() and getY() which simply return values of x and y respectively.
Each of the derived classes (except for AdditionQuestion) has private static integer variables declared and set to the required randomly generated values (_x and _y). Additionally, you will need to create the appropriate constructors and methods as indicated in the TODO comments contained within each class.
The following inputs will be used to test your solution:

15 7 30 48 45 0 2 3 8 1
This should result in a score of 100

14 6 31 47 43 1 3 5 9 2
This should result in a score of 0

15 8 30 49 45 0 3 4 8 1
This should result in a score of 60

IMPORTANT! You must not change any of the starter code for the Random objects found throughout the project. Even though ultimately you would want a more realistic random behavior, each random object has a set seed value so that the results will be the same each time the code is executed, and this is necessary for the zyBook tests to accurately score your lab.