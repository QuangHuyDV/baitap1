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
public class connguoi {
    String hoten;
    String ngaysinh;

    public connguoi(String hoten, String ngaysinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
    }
    public connguoi(){
    }
    
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    void inconnguoi(){
        System.out.println("Bang con nguoi: ");
        System.out.println("Hoten: " + hoten);
        System.out.println("Ngaysinh: " + ngaysinh);

    }
}
