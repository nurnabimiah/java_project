package models;

public class SeipStudent extends Student{
   private int stipped;

    public SeipStudent(String name, int id, String phone, boolean is_offine, int stipped) {
        super(name, id, phone, is_offine);
        this.stipped = stipped;
    }

    @Override
    public void StartSession() {
        System.out.println("Seip student sesson is started.....");
    }

    public int getStipped() {
        return stipped;
    }

    public void setStipped(int stipped) {
        this.stipped = stipped;
    }

    @Override
    public String toString() {
        return "SeipStudent{" +
                "stipped=" + stipped +

                '}';
    }
}
