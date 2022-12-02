class DataValue {
    private String author;
    private int numTitles;

    public DataValue() {
        this.author = "";
        this.numTitles = 0;
    }

    public DataValue(String name) {
        this.author = name;
        this.numTitles = 0; // aspiring author
    }

    public DataValue(String name, int numBooks) {
        this.author = name;
        this.numTitles = numBooks;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumTitles() {
        return numTitles;
    }

    public void setNumTitles(int numTitles) {
        this.numTitles = numTitles;
    }

}
