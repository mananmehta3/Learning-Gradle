package com.product.gradle;

public class Product {
    
    String name;
    String description;
    int price;
    
    public Product() {
        this.price = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.description;
    }

    public int getPrice() {
        return this.price;
    }

}
