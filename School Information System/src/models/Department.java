package models;

public class Department {
    private String departMentName;
    private String departMentBuilding;


    public Department(String departMentName, String departMentBuilding) {
        this.departMentName = departMentName;
        this.departMentBuilding = departMentBuilding;
    }


    public String getDepartMentName() {
        return departMentName;
    }

    public void setDepartMentName(String departMentName) {
        this.departMentName = departMentName;
    }

    public String getDepartMentBuilding() {
        return departMentBuilding;
    }

    public void setDepartMentBuilding(String departMentBuilding) {
        this.departMentBuilding = departMentBuilding;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departMentName='" + departMentName + '\'' +
                ", departMentBuilding='" + departMentBuilding + '\'' +
                '}';
    }
}
