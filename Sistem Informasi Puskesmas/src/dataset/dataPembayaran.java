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
public class dataPembayaran {
    private ArrayList <String> tanggal;
    private ArrayList <Integer> jumlah;
    private ArrayList <Integer> total;
    private ArrayList <Integer> pajak;
    private ArrayList <Integer> totalBayar;
    
    public dataPembayaran(){
       tanggal = new ArrayList<String>(); 
       jumlah = new ArrayList<Integer>(); 
        total= new ArrayList<Integer>();
        pajak = new ArrayList<Integer>();
        totalBayar = new ArrayList<Integer>();
        
    }; //konstruktor // 
    public void inserttanggal(String isi){
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
     public void insertpajak(Integer isi){
        this.pajak.add(isi);
    }
    
    public ArrayList<Integer> getRecordpajak(){
        return this.pajak;
    }
    
     public void inserttotalBayar(Integer isi){
        this.totalBayar.add(isi);
    }
    
    public ArrayList<Integer> getRecordtotalBayar(){
        return this.totalBayar;
    }
    
     public void insertjumlah(Integer isi){
        this.jumlah.add(isi);
    }
    
    public ArrayList<Integer> getrecordjumlah(){
        return this.jumlah;
    }
}
