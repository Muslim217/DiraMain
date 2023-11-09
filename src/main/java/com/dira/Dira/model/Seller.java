package com.dira.Dira.model;

import java.util.ArrayList;
import java.util.List;

public class Seller {
    private String nameOfOrganization; //Наименование организации
    private String numberPhone; //Номер телефона
    private String address; //Адрес
    private List<Product> assortment; //Ассортимент
    private double cash; //Бюджет продавца


    public Seller(String nameOfOrganization, String numberPhone, String address, List<Product> assortment,double cash) {
        this.nameOfOrganization = nameOfOrganization;
        this.numberPhone = numberPhone;
        this.address = address;
        this.assortment = assortment;
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getNameOfOrganization() {

        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {

        this.nameOfOrganization = nameOfOrganization;
    }

    public String getNumberPhone() {

        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {

        this.numberPhone = numberPhone;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public List<Product> getAssortment() {

        return assortment;
    }

    public void setAssortment(List<Product> assortment) {
        this.assortment = assortment;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "nameOfOrganization='" + nameOfOrganization + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void addProductInAssortment(Product product) {
        if (assortment == null) {
            assortment = new ArrayList<>();
        }
        assortment.add(product);
    }

    public void deleteProductInAssortment(Product product) {
        if (assortment != null && !assortment.isEmpty()) {
            assortment.remove(product);
            System.out.println("Удаление удачно!");
        } else System.out.println("Ассортимент пуст");

    }

    public List<Product> returnAllProductInAssortment() {

        return assortment;
    }

    public Product returnProductById(int id) {
        return assortment.get(id);
    }

    public void updateNameOfProductById(int id, String newName) {

        assortment.get(id).setNameProduct(newName);
    }

    public void updateMeasureOfProductById(int id, String newMeasure) {

        assortment.get(id).setMeasure(newMeasure);
    }

    public void updateQuantityOfProductById(int id, double newQuantity) {
        assortment.get(id).setQuantity(newQuantity);
    }

    public void updatePriceOfProductById(int id, double newPrice) {
        assortment.get(id).setPrice(newPrice);
    }
}
