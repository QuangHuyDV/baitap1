/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author LENOVO
 */
public class congnhan {
    private int macn;
    private String name;
    private float price;

    public congnhan(int macn, String name, float price) {
        this.macn = macn;
        this.name = name;
        this.price = price;
    }
    
    public congnhan(){
    
    }

    public int getMacn() {
        return macn;
    }

    public void setMacn(int macn) {
        this.macn = macn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    void incongnhan(){
            System.out.printf("%10s %10s %10s","Macn","Name","Price");
    }
}
