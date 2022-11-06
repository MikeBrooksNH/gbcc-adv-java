package cp_11_13;

public class Flower extends Plant {

    private boolean isAnnual;
    private String colorOfFlowers;

    public void setPlantType(boolean userIsAnnual) {
        isAnnual = userIsAnnual;
    }

    public boolean getPlantType(){
        return isAnnual;
    }

    public void setColorOfFlowers(String userColorOfFlowers) {
        colorOfFlowers = userColorOfFlowers;
    }

    public String getColorOfFlowers(){
        return colorOfFlowers;
    }

    @Override
    public String toString(){
        return new StringBuilder(super.toString())
                .append("\n   Annual: ").append(isAnnual)
                .append("\n   Color of flowers: ").append(colorOfFlowers)
                .toString();
    }
}
