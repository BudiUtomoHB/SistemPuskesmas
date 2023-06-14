/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author GDX
 */
public class dataPasien {
    
    private ArrayList<String> nama;
    private ArrayList<String> tempatLahir;
    private ArrayList<String> tanggalLahir;
    private ArrayList<String> jk;
    private ArrayList<String> telpon;
    private ArrayList<String> alamat;
    
    public dataPasien(){
       nama = new ArrayList<String>(); 
       tempatLahir = new ArrayList<String>(); 
        tanggalLahir= new ArrayList<String>();
        telpon = new ArrayList<String>();
        alamat = new ArrayList<String>();
        jk = new ArrayList<String>();
    }; //konstruktor // 
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    
    //
    
    public void inserttempatLahir(String isi){
        this.tempatLahir.add(isi);
    }
    
    public ArrayList<String> getRecordtempatLahir(){
        return this.tempatLahir;
    }
    
    //
    
    public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordStatus(){
        return this.alamat;
    }
    
    //
    
    public void inserttanggalLahir(String isi){
        this.tanggalLahir.add(isi);
    }
    
    public ArrayList<String> getrecordtanggalLahir(){
        return this.tanggalLahir;
    }
    
    
    
    
    //
    
    public void inserttelpon(String isi){
        this.telpon.add(isi);
    }
    
    public ArrayList<String> getRecordtelpon(){
        return this.telpon;
    }
    
    public void insertjk(String isi){
        this.jk.add(isi);
    }
    
    public ArrayList<String> getRecordjk(){
        return this.jk;
    }
    
    
}
