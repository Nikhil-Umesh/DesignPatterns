package Creational.Builder;

public class CheeseBurger extends Burger {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Cheese Burger";
    }
}

