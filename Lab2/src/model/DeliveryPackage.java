/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nayankarumuri
 */
public class DeliveryPackage {
    int packageId;
    double packageWeight;
    
    ArrayList<Product> productList;
    Customer customer;
    
    public DeliveryPackage(){
        this.productList=new ArrayList<Product>();
        this.customer=new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public ArrayList<Product> getProductList() {    //this is for ArrayList-where it includes products list
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    //As it is list of array:where there are products included, now we need to add a product to retrieve that data
    public Product createProduct(int productId, String productName, double price ){
        Product product=new Product();
        
        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);
        
        //Now after setting above attributes, add those attributes to our prod list
        this.productList.add(product);
        
        //once added we return that product
        return product;
    }
    
    //Now to find that particular product, creating a find prod method
    public Product findProduct(int pid) {
        for (Product prod : this.productList) { //this for is jus like [for int i,i<n,i++] looping
            if (prod.getProductId()==pid) {
                return prod;
            }
        }
        return null;
    }
    
}
