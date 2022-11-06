package cp_11_09;

public class Pet {

    protected String petName;
    protected int petAge;

    public String getName() {
        return petName;
    }

    public void setName(String userName) {
        petName = userName;
    }

    public int getAge() {
        return petAge;
    }

    public void setAge(int userAge) {
        petAge = userAge;
    }

    public void printInfo() {
        System.out.println("cp_11_06.Pet Information: ");
        System.out.println("   Name: " + petName);
        System.out.println("   Age: " + petAge);
    }

}