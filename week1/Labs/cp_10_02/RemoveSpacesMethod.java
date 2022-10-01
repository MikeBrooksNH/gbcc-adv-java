package cp_10_02;

import java.util.Scanner;

public class RemoveSpacesMethod {

    public String removeSpaces (String userString) {
        String retVal = "";

        char[] tmpArry = userString.toCharArray();

        for (int i = 0; i < userString.length(); i++)
            if (tmpArry[i] != ' ')
                retVal += tmpArry[i];
        return(retVal);
    }

    public static void main(String[] args) {
        RemoveSpacesMethod spaceRemover = new RemoveSpacesMethod();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println(spaceRemover.removeSpaces(line));

    }
}
