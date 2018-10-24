
package com.minhtri.store.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Stored information of product.
 * 
 * @author: Tri Vo
 * @version: 1.0
 * @created: 2018-10-24
 */
public class Product {

    private String name;
    private BigDecimal salePrice;
    private BigDecimal marketPrice;
    private List<String> images;
    private List<Attribute> attributes;

    public Product() {
        super();
    }

    public Product(String name, BigDecimal salePrice, BigDecimal marketPrice, List<String> images, List<Attribute> attributes) {
        super();
        this.name = name;
        this.salePrice = salePrice;
        this.marketPrice = marketPrice;
        this.images = images;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", salePrice=" + salePrice + ", marketPrice=" + marketPrice + ", images=" + images
                + ", attributes=" + attributes + "]";
    }

}
