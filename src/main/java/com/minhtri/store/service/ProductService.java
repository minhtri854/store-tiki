
package com.minhtri.store.service;

import java.util.HashMap;
import java.util.Map;

import com.minhtri.store.model.Product;

/**
 * 
 * @author: Tri Vo
 * @version: 1.0
 * @created: 2018-10-24
 */
public class ProductService {

    final Map<String, Product> products = new HashMap<String, Product>();

    /**
     * create product. The product will be push in temporary memory.
     * 
     * @param product
     *            the product want to create.
     */
    public void create(Product product) {
        products.put(product.getName(), product);
    }
    
    /**
     * find product by product name.
     * 
     * @param name name of product.
     * @return the product with given name or <code>null</code> if none found
     */
    public Product findByName(String name) {
        return products.get(name);
    }
}
