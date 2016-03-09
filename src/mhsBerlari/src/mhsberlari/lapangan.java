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
}
