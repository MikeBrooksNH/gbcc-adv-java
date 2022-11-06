package cp_11_11;

public class Course {

    private String courseNumber;
    private String courseTitle;

    public Course() {
        this.courseNumber = "";
        this.courseTitle = "";
    }

    public Course(String courseNum, String title) {
        this.courseNumber = courseNum;
        this.courseTitle = title;
    }


    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }


    public String getCourseNumber() {
        return this.courseNumber;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }


    @Override
    public String toString() {
        String retval = "Course Information: \n";
        retval += "   Course Number: " + this.courseNumber + "\n";
        retval += "   Course Title: " + this.courseTitle;

        return retval;
    }
}
