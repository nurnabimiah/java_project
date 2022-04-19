


public class Dog extends Animal {
    private int d;
    public Dog(int d,int longitivity) {
        super(longitivity);
        this.d= d;
    }

    public void bark()
    {
        System.out.println("barking barking...");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }
}
