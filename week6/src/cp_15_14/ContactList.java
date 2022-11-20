package cp_15_14;

import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        final int MAX_INPUTS = 3;
        ContactNode head = new ContactNode("", "");
        ContactNode contact = head;
        ContactNode nextContact = head;
        Scanner scanner = new Scanner(System.in);
        String name;
        String phone;
        int counter = 0;

        for (counter = 1; counter <= MAX_INPUTS; counter++) {
            try {
                System.out.println("Person " + counter);
                System.out.println("Enter name:");
                name = scanner.nextLine();

                System.out.println("Enter phone number:");
                phone = scanner.nextLine();

                System.out.println("You entered: " + name + ", " + phone + "\n");

                contact = new ContactNode(name, phone);
                nextContact.insertAfter(contact);
                nextContact = contact;
            } catch (Exception e) {
                System.out.println("There was a problem to handle..." + e.getMessage());
            }
        }

        System.out.println("CONTACT LIST");
        contact = head.getNextNodePtr(); // the first place there is actually a contact
        while (contact != null) {
            System.out.println(contact.toString());
            contact = contact.getNextNodePtr();
        }
    }
}
