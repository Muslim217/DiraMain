package com.dira.Dira.model;


import java.util.List;

public class Customer {
    private String nameOfOrganization; //Наименование организации
    private String numberPhone; //Номер телефона
    private String address; //Адрес
    private List<Product> basket; //Корзина
    private double basketPrice; // Сумма покупки
    private double cash; // Бюджет покупателя

    public Customer(String nameOfOrganization, String numberPhone, String address, List<Product> basket,double cash) {
        this.nameOfOrganization = nameOfOrganization;
        this.numberPhone = numberPhone;
        this.address = address;
        this.basket = basket;
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

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

    public double getBasketPrice() {
        return basketPrice;
    }

    public void setBasketPrice(double basketPrice) {
        this.basketPrice = basketPrice;
    }

    @Override
    public String toString() {
        return "Продавец " +
                "Имя организации = '" + nameOfOrganization + '\'' +
                ", номер телефона = '" + numberPhone + '\'' +
                ", адрес '" + address + '\'' +
                '}';
    }





    public void addProductInBasket(Product product){

        basket.add(product);
    }
}
