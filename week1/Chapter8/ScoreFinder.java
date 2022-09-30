
import java.util.Scanner;

public class ScoreFinder {

    public int findScore(int[] scoreVals) {
        int i;
        int returnVal = scoreVals[0];

        for (i = 0; i < scoreVals.length; ++i) {
            if (scoreVals[i] < returnVal) {
                returnVal = scoreVals[i];
            }
        }
        return returnVal;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ScoreFinder quizzes = new ScoreFinder();
        final int NUM_SCORES = 5;
        int[] quizScores = new int[NUM_SCORES];
        int i;
        int returnScore;

        for (i = 0; i < quizScores.length; ++i) {
            quizScores[i] = scnr.nextInt();
        }

        returnScore = quizzes.findScore(quizScores);
        System.out.println(returnScore);
    }
}