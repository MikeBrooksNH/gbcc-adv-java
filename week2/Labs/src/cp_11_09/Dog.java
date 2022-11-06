package cp_11_09;

public class Dog extends Pet {
    private String dogBreed;

    public String getBreed() {
        return dogBreed;
    }


    public void setBreed(String userBreed) {
        dogBreed = userBreed;
    }


    // Commented out, but not quite sure why we wouldn't do this.
    //public void printInfo() {
    //    super.printInfo();
    //    System.out.println("   Breed: " + this.dogBreed);
    //}

}
