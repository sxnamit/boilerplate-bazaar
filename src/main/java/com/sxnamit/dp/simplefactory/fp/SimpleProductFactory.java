package com.sxnamit.dp.simplefactory.fp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SimpleProductFactory {

    private static final Map<String, Supplier<Product>> PRODUCT_MAP = new HashMap<>();

    static {
        PRODUCT_MAP.put("A", () -> new ConcreteProductA());
        PRODUCT_MAP.put("B", () -> new ConcreteProductB());
    }

    public Product create(String type) {
        if (PRODUCT_MAP.get(type) != null) {
            return PRODUCT_MAP.get(type).get();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

}
