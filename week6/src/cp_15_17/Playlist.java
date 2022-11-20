package cp_15_17;
/*
Given main(), complete the SongNode class to include an insertAfter() method that accepts another SongNode as an
argument and inserts the current node after the argument node. Also complete the toString() method to generate a
single song's information as a String.

Then write the Playlist class' toString() method to return a string containing all songs in the playlist. DO NOT
include the dummy head node.

Example(s):

    If the input is:
        Stomp!
        380
        The Brothers Johnson
        The Dude
        337
        Quincy Jones
        You Don't Own Me
        151
        Lesley Gore
        -1

    The output is:
        LIST OF SONGS
        -------------
        Title: Stomp!
        Length: 380
        Artist: The Brothers Johnson

        Title: The Dude
        Length: 337
        Artist: Quincy Jones

        Title: You Don't Own Me
        Length: 151
        Artist: Lesley Gore



 */
import java.util.Scanner;

public class Playlist {
    private final SongNode headNode;
    private SongNode lastNode;
    private SongNode currNode;

    public Playlist() {
        headNode = new SongNode();
        lastNode = headNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();
        SongNode current ;

        String title;
        int length;
        String artist;

        // Read user input until -1  entered
        do {
            title = scanner.nextLine();
            if (!title.equals("-1")) {
                length = scanner.nextInt();
                scanner.nextLine();
                artist = scanner.nextLine();
                playlist.addNodeToList(new SongNode(title, length, artist));
            }
        } while (!title.equals("-1"));

        // Print linked list
        System.out.println("LIST OF SONGS");
        System.out.println("-------------");
        current = playlist.headNode.getNext();
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }

    }

    private void addNodeToList(SongNode song) {
        currNode = song;
        lastNode.insertAfter(currNode);
        lastNode = currNode;
    }

    // TODO: Finish this method
    public String toString() {
        return this.currNode.toString();
    }

}
