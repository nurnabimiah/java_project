public class Animal {

    private int longitivity;

    public Animal(int longitivity) {
        this.longitivity = longitivity;
    }

    public void move()
    {
        System.out.println("Moving on......");
    }

    public int getLongitivity() {
        return longitivity;
    }

    public void setLongitivity(int longitivity) {
        this.longitivity = longitivity;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "longitivity=" + longitivity +
                '}';
    }
}
