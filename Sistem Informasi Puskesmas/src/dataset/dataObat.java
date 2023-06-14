/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class dataObat {
     private ArrayList<String> tanggal;
    private ArrayList<Integer> jumlah ;
     private ArrayList<Integer>total;
    private ArrayList<Integer> totalBayar;
    
     public dataObat(){
       tanggal = new ArrayList<String>(); 
       jumlah = new ArrayList<Integer>(); 
        total= new ArrayList<Integer>();
        totalBayar = new ArrayList<Integer>();
        
}
public void insertanggal(String isi){
        this.tanggal.add(isi);
    }
    
    public ArrayList<String> getRecordtanggal(){
        return this.tanggal;
    }
    
    //
    
    public void inserttotal(Integer isi){
        this.total.add(isi);
    }
    
    public ArrayList<Integer> getRecordtotal(){
        return this.total;
    }
    
     public void inserttotalBayar(Integer isi){
        this.totalBayar.add(isi);
    }
    
    public ArrayList<Integer> getRecordtotalBayar(){
        return this.totalBayar;
    }
    public void insertJumlah(Integer isi){
        this.jumlah.add(isi);
    }
    
    public ArrayList<Integer> getRecordJumlah(){
        return this.jumlah;
    }
}
