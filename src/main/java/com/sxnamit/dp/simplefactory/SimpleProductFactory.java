package com.sxnamit.dp.simplefactory;

public class SimpleProductFactory {

    // can also be a static method for simple cases
    // static method would mean we cannot subclass
    // and change the behavior of create() method
    public Product create(String type) {
        Product product = null;
        if (type.equalsIgnoreCase("A")) {
            return new ConcreteProductA();
        }
        else if (type.equalsIgnoreCase("B")) {
            return new ConcreteProductB();
        }
        return product;
    }

}
