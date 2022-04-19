import models.Course;
import models.Department;

import java.util.ArrayList;

public class StudentInfo {
    private String name;
    private  String phone;
    private  int nid;
    private Department department;
    private ArrayList<Course>coursLsit;





    // department setter and getter method


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //studentinformation constructor
    public StudentInfo(String name, String phone, int nid) {
        this.name = name;
        this.phone = phone;
        this.nid = nid;
    }
     //...........................................................
    // studentinfo setter and getter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<4)
        {
            System.out.println("The name is very short");
        }
        else{
            this.name = name;
        }

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNid() {

        return nid;
    }

    public void setNid(int nid) {

            this.nid = nid;


    }






    //////////////////////////////
    ////////////////////////////////////////////////////////////
    // course getter setter method


    public ArrayList<Course> getCoursLsit() {
        return coursLsit;
    }

    public void setCoursLsit(ArrayList<Course> coursLsit) {
        this.coursLsit = coursLsit;
    }

    // all to string method

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", nid=" + nid +
                ", department=" + department +
                ", coursLsit=" + coursLsit +
                '}';
    }
}

