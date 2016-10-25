package com.centurylink.pctl.mod.cart.domain.cart;
//import com.centurylink.pctl.mod.cart.domain.cart.Product;
/**
 * Created by nagavenkatakirang on 24-10-2016.
 */


import com.centurylink.pctl.mod.core.model.product.Product;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Catalog implements Serializable {

    private Long id;

    private Set<Product> products = new HashSet<>();

    private String name;

    public Catalog() {
    }

    public Catalog(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Catalog{" +
            "id=" + id +
            ", products=" + products +
            ", name='" + name + '\'' +
            '}';
    }
}
