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
    
    public void jumlahSemua(int lebarLapangan, int panjangLapangan, int waktuPutaran,int jumlahKeliling){
        this.lebarLapangan = lebarLapangan;
        this.panjangLapangan = panjangLapangan;
        this.waktuPutaran = waktuPutaran;
        this.jumlahKeliling = jumlahKeliling;
    }
    
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
        return waktuPutaran*60;
    }
    
    void setjumlahKeliling(int jumlahKeliling){
        jumlahKeliling = input.nextInt();
    }
    
    double getlintasanDilalui(){
        return 2*(panjangLapangan+lebarLapangan)*jumlahKeliling;
    }
    
    double getratarataWaktu(){
        return getlintasanDilalui()/waktuPutaran;
    }
}
