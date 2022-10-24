/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Kasutaja
 */
public class Product {
    private String title;
    private int amountShop;
    private float price;

    public Product() {
    }

    public Product(String title, int amountShop, float price) {
        this.title = title;
        this.amountShop = amountShop;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmountShop() {
        return amountShop;
    }

    public void setAmountShop(int amountShop) {
        this.amountShop = amountShop;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "title=" + title 
                + ", amountShop=" + amountShop 
                + ", price=" + price 
                + '}';
    }

}
