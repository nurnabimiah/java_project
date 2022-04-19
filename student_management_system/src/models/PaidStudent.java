package models;

public class PaidStudent extends Student implements Allowance{
    private int courseFee;

    public PaidStudent(String name, int id, String phone, boolean is_offine, int courseFee) {
        super(name, id, phone, is_offine);
        this.courseFee = courseFee;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }



    @Override
    public void StartSession() {
        System.out.println("Paid start session is running ");
    }

    @Override
    public String toString() {
        return "PaidStudent{" +
                "courseFee=" + courseFee +

                '}';
    }

    @Override
    public void allowance() {
        System.out.println("allownce it started");
    }
}