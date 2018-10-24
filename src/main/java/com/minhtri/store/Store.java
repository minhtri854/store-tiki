
package com.minhtri.store;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.minhtri.store.enumeric.TypeEnumeric;
import com.minhtri.store.model.Attribute;
import com.minhtri.store.model.ConfigurableProduct;
import com.minhtri.store.model.Product;
import com.minhtri.store.service.ConfigurableProductService;
import com.minhtri.store.service.ProductService;
import com.minhtri.store.util.AttributeUtil;

/**
 * 
 * @author: Tri Vo
 * @version: 1.0
 * @created: 2018-10-24
 */
public class Store {

    private final static ProductService productService = new ProductService();

    private final static ConfigurableProductService cpService = new ConfigurableProductService();

    public static void main(String[] args) {

        // create product Iphone X 64Gb Black
        String name1 = "Iphone X 64Gb Black";
        BigDecimal salePrice1 = new BigDecimal("999");
        BigDecimal marketPrice1 = new BigDecimal("1099");

        List<String> images1 = new ArrayList<String>();
        images1.add("This is url of image 1");
        images1.add("This is url of image 2");
        images1.add("This is url of image 3");

        List<Attribute> attrs1 = new ArrayList<Attribute>();
        attrs1.add(AttributeUtil.create("color", TypeEnumeric.TEXT, "Black"));
        attrs1.add(AttributeUtil.create("storage", TypeEnumeric.TEXT, "64Gb"));
        attrs1.add(AttributeUtil.create("description", TypeEnumeric.LONG_TEXT, "This is a description"));
        attrs1.add(AttributeUtil.create("origin", TypeEnumeric.TEXT, "This is a origin"));
        attrs1.add(AttributeUtil.create("factoryDate", TypeEnumeric.DATE, new Date()));
        attrs1.add(AttributeUtil.create("weight", TypeEnumeric.FLOAT, 174f));

        Product pro1 = new Product();
        pro1.setName(name1);
        pro1.setSalePrice(salePrice1);
        pro1.setMarketPrice(marketPrice1);
        pro1.setImages(images1);
        pro1.setAttributes(attrs1);

        productService.create(pro1);
        System.out.println(name1 + ": " + pro1);

        // create product Iphone X 128Gb Yellow
        String name2 = "Iphone X 128Gb Yellow";
        BigDecimal salePrice2 = new BigDecimal("950");
        BigDecimal marketPrice2 = new BigDecimal("1050");

        List<String> images2 = new ArrayList<String>();
        images1.add("This is url of image 1");
        images1.add("This is url of image 2");
        images1.add("This is url of image 3");

        List<Attribute> attrs2 = new ArrayList<Attribute>();
        attrs2.add(AttributeUtil.create("color", TypeEnumeric.TEXT, "Yellow"));
        attrs2.add(AttributeUtil.create("storage", TypeEnumeric.TEXT, "128Gb"));
        attrs2.add(AttributeUtil.create("description", TypeEnumeric.LONG_TEXT, "This is a description"));
        attrs2.add(AttributeUtil.create("origin", TypeEnumeric.TEXT, "This is a origin"));
        attrs2.add(AttributeUtil.create("factoryDate", TypeEnumeric.DATE, new Date()));
        attrs2.add(AttributeUtil.create("weight", TypeEnumeric.FLOAT, 178f));

        Product pro2 = new Product();
        pro2.setName(name2);
        pro2.setSalePrice(salePrice2);
        pro2.setMarketPrice(marketPrice2);
        pro2.setImages(images2);
        pro2.setAttributes(attrs2);

        productService.create(pro2);
        System.out.println(name2 + ": " + pro2);

        // create confiurable product Iphone X
        String name = "Iphone X";
        cpService.create(name, pro1, pro2);
        ConfigurableProduct cp = cpService.findByName(name);
        System.out.println(name + ": " + cp);
    }
}
