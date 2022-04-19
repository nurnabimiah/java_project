package models;

public interface TestInterface {

    void test();
    default  void antoherTest()
    {
        System.out.println("Another test is waitting");
    }

}
