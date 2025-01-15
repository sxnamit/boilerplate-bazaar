package com.sxnamit.dp.simplefactory;

public class Client {

    // can use dependency injection here
    private final SimpleProductFactory factory;

    public Client(SimpleProductFactory factory) {
        this.factory = factory;
    }

    public void method() {
        Product productA = factory.create("A");
        System.out.println(productA.whoAmI());
        Product productB = factory.create("B");
        System.out.println(productB.whoAmI());
    }

    public static void main(String[] args) {
        Client client = new Client(new SimpleProductFactory());
        client.method();
    }
}
