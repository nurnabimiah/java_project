import models.Course;
import models.Department;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        StudentInfo sf = new StudentInfo("Nurnabi","01752929714",0050);
        Course c = new Course("Liner Algebra",3.00);

        Department department = new Department("Computer Science and Engineering", "ABC");
        sf.setDepartment(department);

        System.out.println(sf);



    }
}
