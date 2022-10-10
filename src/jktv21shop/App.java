/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21shop;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Scanner;

/**
 *
 * @author Kasutaja
 */
public class App {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        do{
            System.out.println("Функции приложения:");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить товар");
            System.out.println("2. Добавить покупателя");
            System.out.println("3. Продать товар");
            System.out.println("4. Список товаров");
            System.out.print("Выберите номер функции: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить товар");
                    Product product = new Product(); 
                    break;
                case 2:
                    System.out.println("2. Добавить покупателя");
                    Customer customer = new Customer();
                    break;
                case 3:
                    System.out.println("3. Продать товар");
                    Purchase purchase = new Purchase();
                    break;
                case 4:
                    System.out.println("4. Список товаров");
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");
    }
    
}
