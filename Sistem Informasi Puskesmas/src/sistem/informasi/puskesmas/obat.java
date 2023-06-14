/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.puskesmas;

/**
 *
 * @author USER
 */
public class obat {
 
    private String tanggal;
    private int jumlah;
    private int total;
    private int totalBayar;
    
 public obat(){
     this.tanggal=tanggal;
     this.jumlah=jumlah;
     this.total=total;
     this.totalBayar=totalBayar;
 }
 public void settanggal(String tanggal){
        this.tanggal = tanggal;
    }
public void setjumlah(Integer jumlah){
        this.jumlah = jumlah;
    }
public void settotal(Integer total){
        this.total = total;
    }
public void settotalBayar(Integer totalBayar){
        this.totalBayar = totalBayar;
    }
}



