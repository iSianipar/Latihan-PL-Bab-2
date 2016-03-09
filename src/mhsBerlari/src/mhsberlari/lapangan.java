/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhsberlari;

import java.util.Scanner;


public class lapangan {
    Scanner input = new Scanner(System.in);
    private int lebarLapangan;
    private int panjangLapangan;
    private int waktuPutaran;
    private int jumlahKeliling;
    
    void setlebarLapangan(int lebarLapangan){
        lebarLapangan = input.nextInt();
    }
    
    int getlebarLapangan(){
        return lebarLapangan;
    }
    
    void setpanjangLapangan(int panjanganLapangan){
        panjanganLapangan= input.nextInt();
    }
    
    int getpanjangLapangan(){
        return panjangLapangan;
    }
    
    void setwaktuPutaran(int waktuPutaran){
        waktuPutaran = input.nextInt();
        
    }
    
    int getwaktuPutaran(){
        return waktuPutaran;
    }
    
    void setjumlahKeliling(int jumlahKeliling){
        jumlahKeliling = input.nextInt();
    }
    
    int getlintasanDilalui(){
        return panjangLapangan*lebarLapangan*jumlahKeliling;
    }
    
    int getratarataWaktu(){
        return getlintasanDilalui()/waktuPutaran;
    }
}
