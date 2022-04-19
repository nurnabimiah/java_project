package models;

public class Course {
    private String courseName;
    private double courseCreadit;

    public Course(String courseName, double courseCreadit) {
        this.courseName = courseName;
        this.courseCreadit = courseCreadit;
    }



    ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    // setter and getter method////////////////////////////////

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseCreadit() {
        return courseCreadit;
    }

    public void setCourseCreadit(double courseCreadit) {
        this.courseCreadit = courseCreadit;
    }



    /////////////////////////////////////////////
    /////to string method/////////////


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCreadit=" + courseCreadit +
                '}';
    }
}
