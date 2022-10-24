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
public class Customer {
    private String name;
    private String phone;
    private float money;

    public Customer() {
    }
    
    public Customer(String name, String phone, float money) {
        this.name = name;
        this.phone = phone;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" 
                + "name=" + name 
                + ", phone=" + phone 
                + ", money=" + money 
                + '}';
    }

}
