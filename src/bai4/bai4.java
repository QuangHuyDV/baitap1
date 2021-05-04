/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class bai4 {
    static Scanner sc = new Scanner(System.in);
        static void nhap(congnhan so){
            System.out.print("Nhap ma cong nhan: ");
            so.setMacn(sc.nextInt());sc.nextLine();
            System.out.print("Nhap ten cong nhan: ");
            so.setName(sc.nextLine());
            System.out.print("Nhap luong cong nhan: ");
            so.setPrice(sc.nextFloat());
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        congnhan all[] = null;
        int a,n=0;
        boolean flag = true;
        do{
            System.out.println("Ban muon lam  gi?");
            System.out.println("1.Tao thong tin cong nhan\n"+
                    "2.Ke khai thong tin cong nhan\n"+
                    "3.Sap xep thong tin cong nhan theo thu tu giam dan.\n "+
                    "Nhap so khac de thoat");
            a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhap so luong cong nhan muon khai bao:");
                    n=sc.nextInt();
                    all= new congnhan[n];
                    for(int i=0;i<n;i++){
                        System.out.println("Cong nhan thu" + (i+1));
                        all[i] = new congnhan();
                        nhap(all[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%10s %10s %10s","Macn","Name","Price");
                    for (int i=0;i<n;i++){
                        all[i].incongnhan();
                    }
                    break;
                case 3:
                    int tg;
                    for(int i =0; i<n; i++){
                        for(int j = i+1;  j<n; j++){
                            if(all[i] < all[j]){
                                tg = all[i];
                                all[i] = all[j];
                                all[j] = tg;
                            }
                        }
                    }
                    System.out.printf("%10s %10s %10s","Macn","Name","Price");
                default:
                    System.out.println("bye");
                    flag=false;
                    break;
            }
        }while(flag);
    }
    
}
