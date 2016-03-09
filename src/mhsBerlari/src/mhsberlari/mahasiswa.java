/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhsberlari;

/**
 *
 * @author IANLORD
 */
public class mahasiswa {
    private String nama;
    private int jmlMhs;
    
    
    public void inputan(String nama, int jmlMhs){
        this.nama = nama;
        this.jmlMhs = jmlMhs;
      
    }
    
    public int jumlahMahasiswa(){
        return jmlMhs;
    }
}
