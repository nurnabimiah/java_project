

public class Cat extends Animal {

     private  int c;
    public Cat(int c,int longitivity) {
        super(longitivity);
        this.c= c;
    }

    public void meow() {
        System.out.println("Mew Mew");
    }


    @Override
    public void move() {
        System.out.println("Moving cat");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "c=" + c +
                '}';
    }
}