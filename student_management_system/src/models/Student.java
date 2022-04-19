package models;


abstract public class Student {
    private String name;
    private  int id;
    private String phone;
    private boolean is_offine;

    public Student(String name, int id, String phone, boolean is_offine) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.is_offine = is_offine;
    }

    public Student() {

    }

    abstract public void StartSession();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isIs_offine() {
        return is_offine;
    }

    public void setIs_offine(boolean is_offine) {
        this.is_offine = is_offine;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                ", is_offine=" + is_offine +
                '}';
    }
}
