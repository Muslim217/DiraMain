package com.dira.Dira.model;


import com.dira.Dira.enumuration.CategoryOfProduct;
import jakarta.persistence.*;


public class Product {

    private long id;
    private String nameProduct; //Имя продукта
    private String measure; //Мера измерения продукта
    private double quantity; //Кол-во продукта
    private double price; //Цена продукта
    private CategoryOfProduct categoryOfProduct;

    public Product(int id, String nameProduct, String measure, double quantity, double price, CategoryOfProduct categoryOfProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.measure = measure;
        this.quantity = quantity;
        this.price = price;
        this.categoryOfProduct = categoryOfProduct;
    }
    public Product(){

    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryOfProduct getCategoryOfProduct() {
        return categoryOfProduct;
    }

    public void setCategoryOfProduct(CategoryOfProduct categoryOfProduct) {
        this.categoryOfProduct = categoryOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", measure='" + measure + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", categoryOfProduct=" + categoryOfProduct +
                '}';
    }
}
