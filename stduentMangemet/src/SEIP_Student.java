


public class SEIP_Student extends Student_Information{

    private String course_fee;

    public String getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(String course_fee) {
        this.course_fee = course_fee;
    }

    public SEIP_Student(String name, String phone, String address, boolean class_mode, String course_fee) {
        super(name, phone, address, class_mode);
        this.course_fee=course_fee;
    }

    @Override
    public String toString() {
        return "SEIP_Student{" +
                "course_fee='" + course_fee + '\'' +
                '}';
    }
}



