package models;

public class TestImplementor implements TestInterface{


    @Override
    public void test() {
        System.out.println("Thanks for another test");
    }
}
