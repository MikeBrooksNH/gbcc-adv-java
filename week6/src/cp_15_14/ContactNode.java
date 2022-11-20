package cp_15_14;

/*
You will be building a linked list. Make sure to keep track of both the head and tail nodes.

(1) Create two files to submit.

ContactNode.java - Class definition
ContactList.java - Contains main() method

(2) Build the ContactNode class per the following specifications:

Parameterized constructor with parameters for contact name and phone number.

Private fields

String contactName
String contactPhoneNumber
ContactNode nextNodePtr

Public member methods

getName() - Accessor (1 pt)
getPhoneNumber - Accessor (1 pt)
insertAfter() (2 pts)
getNext() - Accessor (1 pt)
toString()


data:


Roxanne Hughes
443-555-2864
Juan Alberto Jr.
410-555-9385
Rachel Phillips
310-555-6610


 */
public class ContactNode {

    private String contactName;
    private String contactPhoneNumber;
    private ContactNode nextNodePtr;

    public ContactNode(String name, String number) {
        this.contactName = name;
        this.contactPhoneNumber = number;
        this.nextNodePtr = null;
    }
    public String getName() {
        return this.contactName;
    }

    public String getPhoneNumber() {
        return this.contactPhoneNumber;
    }

    public ContactNode getNext() {
        return this.nextNodePtr;
    }

    public void insertAfter(ContactNode ptr) {
        ContactNode tmpptr = this.nextNodePtr;  // get where we are
        this.nextNodePtr = ptr;     // where ever the next thing is
        ptr.nextNodePtr = tmpptr;   // the next place is the current place
    }

    public ContactNode getNextNodePtr() {
        return nextNodePtr;
    }

    public String getContactName() {
        return contactName;
    }

    ;
    //@Override
    public String toString() {


        //System.out.println("Name: " + this.contactName);
        //System.out.println("Phone number: " + this.contactPhoneNumber);

        return ("Name: " + this.contactName + "\nPhone number: " + this.contactPhoneNumber + "\n");
    }
}
