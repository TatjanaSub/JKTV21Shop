/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Kasutaja
 */
public class Purchase {
    private Customer customer;
    private Date takeOfProduct;
    private Product product;
    private int amountCustomer;
    private float priceCustomer;

    public Purchase() {
    }

    public Purchase(Customer customer, Date takeOfProduct, Product product, int amountCustomer, float priceCustomer) {
        this.customer = customer;
        this.takeOfProduct = takeOfProduct;
        this.product = product;
        this.amountCustomer = amountCustomer;
        this.priceCustomer = priceCustomer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTakeOfProduct() {
        return takeOfProduct;
    }

    public void setTakeOfProduct(Date takeOfProduct) {
        this.takeOfProduct = takeOfProduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmountCustomer() {
        return amountCustomer;
    }

    public void setAmountCustomer(int amountCustomer) {
        this.amountCustomer = amountCustomer;
    }

    public float getPriceCustomer() {
        return priceCustomer;
    }

    public void setPriceCustomer(float priceCustomer) {
        this.priceCustomer = priceCustomer;
    }

    @Override
    public String toString() {
        return "Purchase{" 
                + "customer=" + customer 
                + ", takeOfProduct=" + takeOfProduct 
                + ", product=" + product 
                + ", amountCustomer=" + amountCustomer 
                + ", priceCustomer=" + priceCustomer 
                + '}';
    }


}
