/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class bai3 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
        static void nhapconnguoi(connguoi a1){
            System.out.print("Nhap ten: ");
            a1.setHoten(sc.nextLine());sc.nextLine();
            System.out.print("Nhap ngay sinh: ");
            a1.setNgaysinh(sc.nextLine());
        }
        static void nhaphocsinh(hocsinh b1){
            System.out.print("Nhap mahs: ");
            b1.setMahs(sc.nextLine());sc.nextLine();
            System.out.print("Nhap ten hs: ");
            b1.setName(sc.nextLine());
        }
        static void nhapgiaovien(giaovien c1){
            System.out.print("Nhap magv: ");
            c1.setMagv(sc.nextLine());sc.nextLine();
            System.out.print("Nhap lop hoc: ");
            c1.setLophoc(sc.nextLine());
        }
    public static void main(String[] args) {
        connguoi all[] = null; //mang chua con nguoi
        hocsinh bb[] = null;
        giaovien cc[] = null;
        int a,n=0,n2=0,n3=0;
        boolean flag= true;
        do{
            System.out.print("Ban muon lam gi? \n");
            System.out.println("1.Tao thong tin ve con nguoi\n"+
                    "2.Tao thong tin ve hoc sinh\n"+
                    "3.Tao thong tin ve giao vien\n"+
                    "4.Hien thong tin ve con nguoi\n"+
                    "5.Hien thong tin ve hoc sinh\n"+
                    "6.Hien thong tin ve giao vien.\n\n"+
                    "Nhap so khac de thoat");
            a = sc.nextInt();
            switch(a){
                case 1:
                    System.out.print("Nhap so luong nguoi ma ban muon them: ");
                    n = sc.nextInt();
                    all = new connguoi[n];
                    for (int i = 0;i<n;i++){
                        System.out.println("Nguoi thu "+ (i+1));
                        all[i] = new connguoi();
                        nhapconnguoi(all[i]);
                    }
                    break;
                case 2:
                    System.out.print("Nhap so luong hoc sinh ma ban muon them: ");
                    n2 = sc.nextInt();
                    bb = new hocsinh[n2];
                    for (int i = 0;i<n2;i++){
                        System.out.println("Hoc sinh thu "+ (i+1));
                        bb[i] = new hocsinh();
                        nhaphocsinh(bb[i]);
                    }
                    break;
                case 3:
                    System.out.print("Nhap so luong giao vien ma ban muon them: ");
                    n3 = sc.nextInt();
                    cc = new giaovien[n3];
                    for (int i = 0;i<n3;i++){
                        System.out.println("Giao vien thu "+ (i+1));
                        cc[i] = new giaovien();
                        nhapgiaovien(cc[i]);
                    }
                    break;
                case 4:
                    
                    for (int i = 0; i < n; i++){
                        all[i].inconnguoi();
                    }
                    break;
                case 5:
                    for (int i = 0; i < n; i++){
                        bb[i].inhocsinh();
                    }
                    break;
                case 6:
                    
                    for (int i = 0; i < n; i++){
                        cc[i].ingiaovien();
                    }
                    break;
                default:
                    System.out.println(":)");
                    flag=false;
                    break;
            }
        }while(flag);
    }
    
}
