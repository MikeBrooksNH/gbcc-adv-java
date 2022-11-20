package cp_15_19;
/*
Given main(), complete the program to add people to a queue. The program should read in a list of people's names
including "You" (ending with -1), adding each person to the peopleInQueue queue. Then, remove each person from the
queue until "You" is at the head of the queue. Include print statements as shown in the example below.

Example(s):
    If the input is:
      Zadie Smith
      Tom Sawyer
      You
      Louisa Alcott
      -1
   The output is:
      Welcome to the ticketing service...
      You are number 3 in the queue.
      Zadie Smith has purchased a ticket.
      You are now number 2
      Tom Sawyer has purchased a ticket.
      You are now number 1
      You can now purchase your ticket!
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personName = "";
        int counter = 0;
        int youPosition;
        youPosition = 0;
        Queue<String> peopleInQueue = new LinkedList<String>();

        personName = scanner.nextLine();
        while (!personName.equals("-1")) {
            peopleInQueue.add(personName);  // add the name to the queue
            counter++;  // increment the to number of people waiting

            if (personName.equals("You")) {  // is this me?
                youPosition = counter; // it is! this is the position I'm at in the queue
            }
            personName = scanner.nextLine();  // get another name
        }

        System.out.println("Welcome to the ticketing service... ");
        System.out.println("You are number " + youPosition + " in the queue.");

        int position = youPosition;
        for (int i = 0; i < position; i++) {
            String name = peopleInQueue.peek();
            if (!name.equals("You")) {
                System.out.println(peopleInQueue.remove() + " has purchased a ticket.");
                System.out.println("You are now number " + (--youPosition));
            }
        }
        System.out.println("You can now purchase your ticket!");
    }
}
