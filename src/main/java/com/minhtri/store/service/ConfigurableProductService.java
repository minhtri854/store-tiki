
package com.minhtri.store.service;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

import com.minhtri.store.model.ConfigurableProduct;
import com.minhtri.store.model.Product;

/**
 * 
 * @author: Tri Vo
 * @version: 1.0
 * @created: 2018-10-24
 */
public class ConfigurableProductService {

    final Map<String, ConfigurableProduct> configurableProducts = new HashMap<String, ConfigurableProduct>();

    /**
     * create configurable product. The configurable product will be push in
     * temporary memory.
     * 
     * @param name
     *            name of product.
     * @param products
     *            list product want to create.
     */
    public void create(String name, Product... products) {
        ConfigurableProduct configurableProduct = new ConfigurableProduct();
        configurableProduct.setProducts(Arrays.asList(products));
        configurableProducts.put(name, configurableProduct);
    }

    public ConfigurableProduct findByName(String name) {
        return configurableProducts.get(name);
    }
}
