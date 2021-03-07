/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOriented;

/**
 *
 * @author abli
 */
public class Product {

    // Private
    private int prodcutno;
    private String name;
    private double price;
    private int quantity;

    // Construct
    public Product(int prodcutno, String name, double price, int quantity) {
        prodcutno = 01;
        name = "orange";
        price = 1.00;
        quantity = 3;

    }

    //setter
    public void setProdcutno(int productno) {
        this.prodcutno = productno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //getter
    public int getProductno(int productno) {
        return productno;
    }
    public String getName(String name){
        return name;
    }
    public double getPrice(double price){
        return price;
    }
    public int getQuantity(int quantity){
        return quantity;
    }
}

class Consumer {

    // Private
    private String id;
    private String name;
    private String address;
    private int tlf;

    // Construct
    public Consumer(String id, String name, String address, int tlf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tlf = tlf;
    }

    // getter
    public String getCusid(String id) {
        return id;
    }

    public String getName(String name) {
        return name;
    }

    public String getAddress(String address) {
        return address;
    }

    public int getTlf() {
        return tlf;
    }
    
    //setter
    public 

}
