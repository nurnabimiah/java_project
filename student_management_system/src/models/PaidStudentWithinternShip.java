package models;

public class PaidStudentWithinternShip extends PaidStudent {

    private int duration;



    public PaidStudentWithinternShip(String name, int id, String phone, boolean is_offine, int courseFee, int duration) {
        super(name, id, phone, is_offine, courseFee);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
