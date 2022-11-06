package cp_11_11;

public class OfferedCourse extends Course {
    private String instructorName;
    private String term;
    private String classTime;


    public OfferedCourse() {
        super();
        this.instructorName = "";
        this.term = "";
        this.classTime = "";
    }

    public OfferedCourse(String cnum, String title, String instructorName, String term, String classTime) {

        super(cnum, title);
        this.instructorName = instructorName;
        this.term = term;
        this.classTime = classTime;
    }


    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getTerm() {
        return term;
    }

    public String getClassTime() {
        return classTime;
    }


    @Override
    public String toString() {

        String retval = super.toString();
        retval += "\n   Instructor Name: " + this.instructorName;
        retval += "\n   Term: " + this.term;
        retval += "\n   Class Time: " + this.getClassTime();

        return retval;
    }
}
