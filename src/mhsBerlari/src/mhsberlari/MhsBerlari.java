/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhsberlari;

import java.util.Scanner;

public class MhsBerlari {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int jmlMhs,panjangLapangan,lebarLapangan,waktuPutaran,jumlahKeliling;
       String nama,nim;
       lapangan masukkan = new lapangan();
        System.out.print("Masukkan jumlah mahasiswa   : ");
       jmlMhs = input.nextInt();
        System.out.print("Masukkan panjang lapangan   : ");
       panjangLapangan = input.nextInt();
        System.out.print("Masukkan lebar lapangan     : ");
       lebarLapangan = input.nextInt();
               System.out.println("");
       lapangan inputan[] = new lapangan[jmlMhs];
       for(int i = 0; i<inputan.length; i++){
           inputan[i] = new lapangan();
           System.out.print("Masukkan NIM : ");
           nim = input.next();
           System.out.print("Masukkan Nama : ");
           nama= input.next();
           lapangan isian = new lapangan();
           System.out.print("Masukkan jumlah putaran : ");
           jumlahKeliling = input.nextInt();
           System.out.print("Masukkan Waktu : ");
           waktuPutaran = input.nextInt();
           System.out.println("");
           inputan[i].jumlahSemua(lebarLapangan, panjangLapangan, waktuPutaran*60, jumlahKeliling);
           System.out.println("Jumlah lintasan yang dilalui : "+inputan[i].getlintasanDilalui());
           System.out.println("Rata - rata waktu            : "+inputan[i].getratarataWaktu());
           System.out.println("");
           
       }
       
       
       
       
       
    }
    
}
