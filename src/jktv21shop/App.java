/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21shop;

//import entity.Customer;
//import entity.Product;
//import entity.Purchase;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Arrays;
import java.util.Scanner;
import managers.CustomerManager;
import managers.ProductManager;
import managers.PurchaseManager;

/**
 *
 * @author Kasutaja
 */
public class App {
    private final Scanner scanner;
    private final CustomerManager customerManager;
    private final PurchaseManager purchaseManager;
    private final ProductManager productManager;
    private Purchase[] purchases;
    private Customer[] customers;
    private Product[] products;
    

    public App() {
        scanner = new Scanner(System.in);
        customerManager = new CustomerManager();
        purchaseManager = new PurchaseManager();
        productManager = new ProductManager();
        
        purchases = new Purchase[0];
        customers = new Customer[0];
        products = new Product[0];
        testAddCustomer();
        testAddProduct();
    }
    
    public void run(){
        boolean repeat = true;
        do{
            System.out.println("Функции приложения:");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить товар");
            System.out.println("2. Список товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Продажа товара покупателю ");
            System.out.println("6. Список продаж");
            System.out.print("Выберите номер функции: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить товар");
                 //   Product product = new Product(); 
                    break;
                case 2:
                    System.out.println("2. Список товаров");
                    System.out.println(products[0]);
                    break;
                case 3:
                    System.out.println("3. Добавить покупателя");
               //     Customer customer = new Customer();
                    break;
                case 4:
                    System.out.println("4. Список покупателей");
                    System.out.println(customers[0]);
                    break;
                case 5:
                    System.out.println("5. Продажа товара покупателю");
                //    Purchase purchase = new Purchase();
                    break;
                case 6:
                    System.out.println("6. Список продаж");
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");
    }
    
    private void addCustomer(Customer customer){
        customers = Arrays.copyOf(customers, customers.length + 1);
        customers[customers.length - 1] = customer;
    }
     
    private void addProduct(Product product){
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }
    
    private void addPurchase(Purchase purchase){
        purchases = Arrays.copyOf(purchases, purchases.length + 1);
        purchases[purchases.length - 1] = purchase;
    }

    private void testAddCustomer() {
        Customer customer = new Customer("Ivan Ivanov","53912939",(float) 350.5);
        customers = Arrays.copyOf(customers, customers.length + 1);
        this.customers[this.customers.length - 1] = customer;
    }

    private void testAddProduct() {
        Product product = new Product("Voina i mir", 20, (float) 10.99);
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }
    
}
