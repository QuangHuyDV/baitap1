/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author LENOVO
 */
public class giaovien {
    String magv;
    String[] lophoc;

    public giaovien(String magv, String[] lophoc) {
        this.magv = magv;
        this.lophoc = lophoc;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public String[] getLophoc() {
        return lophoc;
    }

    public void setLophoc(String[] lophoc) {
        this.lophoc = lophoc;
    }

    
    void ingiaovien(){
        System.out.println("Bang giao vien: ");
        System.out.println("Magv: " + magv);
        System.out.println("Lophoc: " + lophoc);

    }
}
