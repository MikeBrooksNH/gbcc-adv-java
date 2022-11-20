package cp_15_17;

import cp_15_14.ContactNode;

public class SongNode {
    private final String songTitle;
    private final int songLength;
    private final String songArtist;
    private SongNode nextNode; // Reference to the next node

    // No-argument constructor
    public SongNode() {
        this("", 0, "");
    }

    // Parameterized constructor (next node is unknown)
    public SongNode(String title, int length, String artist) {
        songTitle = title;
        songLength = length;
        songArtist = artist;
        nextNode = null;
    }

    // TODO: Complete this method to insert a new node after
    // the node passed as an argument
    public void insertAfter(SongNode node) {
        SongNode tmpptr = this.nextNode;  // get where we are
        this.nextNode = node;     // where ever the next thing is
        node.nextNode = tmpptr;   // the next place is the current place

    }

    // Get location pointed by nextNode
    public SongNode getNext() {
        return nextNode;
    }

    // TODO: Complete this method to represent a single song
    // as a String
    public String toString() {
        return "Title: " + this.songTitle +
                "\nLength: " + this.songLength +
                "\nArtist: " + this.songArtist + "\n";
    }
}
