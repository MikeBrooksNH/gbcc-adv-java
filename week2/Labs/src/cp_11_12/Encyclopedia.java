package cp_11_12;

public class Encyclopedia extends Book {

    private String edition;
    private int numVolumes;

    public Encyclopedia() {
        super();
        this.edition = "";
        this.numVolumes = 0;
    }

    public Encyclopedia(String eTitle, String eAuthor, String ePublisher, String ePublicationDate, String edition, int numVolumes) {
        super(eTitle, eAuthor, ePublisher, ePublicationDate);
        this.edition = edition;
        this.numVolumes = numVolumes;
    }

    public String getEdition() {
        return edition;
    }

    public int getNumVolumes() {
        return numVolumes;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setNumVolumes(int numVolumes) {
        this.numVolumes = numVolumes;
    }

    @Override
    public String toString() {

        String retval = "Encyclopedia Information: ";
        retval += super.getBookInfo();
        retval += "\n   Edition: " + this.edition;
        retval += "\n   Number of Volumes: " + this.numVolumes + "\n";

        return retval;
    }
}
