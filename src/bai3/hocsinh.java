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
public class hocsinh {
    String mahs;
    String name;

    public hocsinh(String mahs, String name) {
        this.mahs = mahs;
        this.name = name;
    }

    public String getMahs() {
        return mahs;
    }

    public void setMahs(String mahs) {
        this.mahs = mahs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    void inhocsinh(){
        System.out.println("Bang hoc sinh: ");
        System.out.println("Mahs: " + mahs);
        System.out.println("Hoten: " + name);

    }
}
