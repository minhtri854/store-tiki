
package com.minhtri.store.model;

import java.util.List;

/**
 * The ConfigurableProduct class can be stored a configurable product that is
 * combination of 2 or more products with different variations.
 * 
 * @author: Tri Vo
 * @version: 1.0
 * @created: 2018-10-24
 */
public class ConfigurableProduct {

    private List<Product> products;

    public ConfigurableProduct() {
        super();
    }

    public ConfigurableProduct(List<Product> products) {
        super();
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ConfigurableProduct [products=" + products + "]";
    }

}
