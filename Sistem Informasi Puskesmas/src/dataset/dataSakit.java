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
public class dataSakit {
  
    private ArrayList<String> sktu;
    private ArrayList<String> sktb;
    
    public dataSakit(){
        sktu = new ArrayList<String>(); 
        sktb = new ArrayList<String>(); 

    
    }
    public void insertSakitUmum(String isi){
        this.sktu.add(isi);
    }
    
    public ArrayList<String> getRecordSakitUmum(){
        return this.sktu;
    }
    
    //
    
    public void insertSakitBerat(String isi){
        this.sktb.add(isi);
    }
    
    public ArrayList<String> getRecordSakitBerat(){
        return this.sktb;
    }
    
    //
    
}

