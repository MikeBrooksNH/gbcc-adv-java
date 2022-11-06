package cp_11_10;

public class StringInstrument extends Instrument {


    private int numStrings;
    private int numFrets;

    public StringInstrument() {
        this.numStrings = 0; // string capacity could be 24, but it might not be strung yet...
        this.numFrets = 0;
    }
    public StringInstrument(String name,  String manufacturer,int yearBuilt,int cost, int numStrings, int numFrets) {
        super(name, manufacturer, yearBuilt, cost);


        this.numStrings = numStrings;
        this.numFrets = numFrets;
    }

    // TO DO: Define accessor and mutator methods for both private variables

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public int getNumFrets() {
        return numFrets;
    }

    public void setNumFrets(int numFrets) {
        this.numFrets = numFrets;
    }

    public String toString() {
        String retval = super.toString();
        retval += "\n" + "   Number of strings: " + this.numStrings + "\n";
        retval += "   Number of frets: " + this.numFrets;

        return(retval);
    }
}
