package cp_10_08;

public class Student {

    private String name;
    private double gpa;

    private String favoriteCourse;
    private boolean deansList;


    public Student() {
        this.name = "Louie";
        this.gpa = 1.0;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public double getGPA(){
        return this.gpa;
    }

    public static void main(String[] args) {
        //Uncomment all lines below once you have defined the missing methods

        Student student = new Student();
        System.out.println(student.getName() + "/" + student.getGPA());

        student.setName("Felix");
        student.setGPA(3.7);
        System.out.println(student.getName() + "/" + student.getGPA());
    }
}
