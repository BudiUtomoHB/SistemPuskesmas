/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.puskesmas;

/**
 *
 * @author USER
 */
public class Pasien {
     private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String jk;
    private String telpon;
    private String alamat;
  
    
    public Pasien (String nama, String tempatLahir, String tanggalLahir, String jenisKelamin, String telpon, String alamat){ //Constructor Overload
        setNamapasien(nama);
        setTempatLahir(tempatLahir);
        setTanggalLahir(tanggalLahir);
        setjk(jenisKelamin);
        setTelpon(telpon);
        setAlamat(alamat);
    }
    
    //method set
    public void setNamapasien(String nama){
        this.nama = nama;
    }
    public void setTempatLahir(String tempatLahir){
        this.tempatLahir = tempatLahir;
    }
    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }
    
    public void setjk(String jenisKelamin){
        this.jk = jenisKelamin;
    }
    public void setTelpon(String telpon){
        this.telpon = telpon;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
  
    public String getTempatLahir(){
        return tempatLahir;
    }
    public String getTanggalLahir(){
        return tanggalLahir;
    }
    
    public String getJenisKelamin(){
        return jk;
    }
    public String getTelpon(){
        return telpon;
    }
    public String getAlamat(){
        return alamat;
    }
    
}

    
