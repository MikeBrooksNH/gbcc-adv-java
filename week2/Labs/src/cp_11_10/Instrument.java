package cp_11_10;

public class Instrument {


    private String name;
    private String manufacturer;
    private int yearBuilt;
    private int cost;

    public Instrument() {
        this.name = "";
        this.manufacturer = "";
        this.yearBuilt = 0;
        this.cost = 0;
    }

    public Instrument(String name, String manufacturer, int yearBuilt, int cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearBuilt = yearBuilt;
        this.cost = cost;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

     public String toString() {
        String retval = "Instrument Information: \n";
        retval += "   Name: " + this.name + "\n";
        retval += "   Manufacturer: " + this.manufacturer + "\n";
        retval += "   Year built: " + this.yearBuilt + "\n";
        retval += "   Cost: " + this.cost;

        return(retval);
    }

}
