
public class Student_Information {

     private String name;
     private String phone;
     private String address;

     private boolean class_mode;

    public Student_Information(String name, String phone, String address, boolean class_mode) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.class_mode = class_mode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isClass_mode() {
        return class_mode;
    }

    public void setClass_mode(boolean class_mode) {
        this.class_mode = class_mode;
    }

    @Override
    public String toString() {
        return "Student_Information{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", class_mode=" + class_mode +
                '}';
    }
}
