package Creational.Singelton;

public class SingleObject {
    private static final SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
