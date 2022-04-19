import models.*;

import javax.security.auth.callback.Callback;

public class MainClass {

    public static void main(String[] args) {
        SeipStudent seipStudent = new SeipStudent("nurnabi",171,"01752929714",false,9000);
        PaidStudentWithinternShip paidStudentWithinternShip = new PaidStudentWithinternShip("nurnabi",171,"01752929714",false,9000,6);

       Student [] students = {seipStudent,paidStudentWithinternShip};

        Callback(students);


     /* Student student = new Student() {
           @Override
           public void StartSession() {
               System.out.println("Start session is running..");
           }
       };


        student.StartSession();

        TestInterface testInterface = new TestImplementor();
        testInterface.test();
        testInterface.antoherTest();*/



    }


    public static void Callback(Student[] students)
    {
        for(Student s: students)
        {  if(s instanceof Allowance)
           s.StartSession();
        }
    }
}
