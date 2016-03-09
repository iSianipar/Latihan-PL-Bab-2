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
        System.out.print("Masukkan jumlah mahasiswa   : ");
       jmlMhs = input.nextInt();
        System.out.print("Masukkan panjang lapangan   : ");
       panjangLapangan = input.nextInt();
        System.out.print("Masukkan lebar lapangan     : ");
       lebarLapangan = input.nextInt();
               
       mahasiswa inputan[] = new mahasiswa[jmlMhs];
       for(int i = 0; i<inputan.length; i++){
           inputan[i] = new mahasiswa();
           System.out.print("Masukkan NIM : ");
           nim = input.next();
           System.out.println("Masukkan Nama : ");
           nama= input.next();
       }
       
    }
    
}
