package cp_11_13;

public class Plant {
    protected String plantName;
    protected String plantCost;

    public void setPlantName(String userPlantName) {
        plantName = userPlantName;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantCost(String userPlantCost) {
        plantCost = userPlantCost;
    }

    public String getPlantCost() {
        return plantCost;
    }

    public String toString() {
        String className = this.getClass().getName();
        className = className.substring(className.indexOf('.')+1);
        return new StringBuilder(className)
                .append(" Information: ")
                .append("\n   Name: " + plantName)
                .append("\n   Cost: " + plantCost)
                .toString();
    }
}
