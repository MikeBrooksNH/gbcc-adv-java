package cp_10_04;

// Simulates a simple car with operations to drive and check the odometer.
public class SimpleCar {

    // Number of miles driven
    private int miles;

    public SimpleCar() {
        miles = 0;
    }

    public void drive(int dist) {
        miles = miles + dist;
    }

    public void reverse(int dist) {
        miles = miles - dist;
    }

    public int getOdometer() {
        return miles;
    }

    public void honkHorn() {
        System.out.println("beep beep");
    }

    public void report() {
        System.out.println("Car has driven: " + miles + " miles");
    }

}

