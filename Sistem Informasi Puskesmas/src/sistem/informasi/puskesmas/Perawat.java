/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.puskesmas;

/**
 *
 * @author ASUS
 */
public class Perawat {
    
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String agama;
    private String jenisKelamin;
    private String telpon;
    private String email;
    private String alamat;
    private String pendidikan;
    private String status;
    private String jabatan;
    
    public Perawat(String nama, String tempatLahir, String tanggalLahir, String agama, String jenisKelamin, String telpon,
            String email, String alamat, String pendidikan, String status, String jabatan){ //Constructor Overload
        setNamaPerawat(nama);
        setTempatLahir(tempatLahir);
        setTanggalLahir(tanggalLahir);
        setAgama(agama);
        setJenisKelamin(jenisKelamin);
        setTelpon(telpon);
        setEmail(email);
        setAlamat(alamat);
        setPendidikan(pendidikan);
        setStatus(status);
        setJabatan(jabatan);
    }
    
    //method set
    public void setNamaPerawat(String nama){
        this.nama = nama;
    }
    public void setTempatLahir(String tempatLahir){
        this.tempatLahir = tempatLahir;
    }
    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }
    public void setAgama(String agama){
        this.agama = agama;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setTelpon(String telpon){
        this.telpon = telpon;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setPendidikan(String pendidikan){
        this.pendidikan = pendidikan;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    //method get
    public String getNamaGuru(){
        return nama;
    }
    public String getTempatLahir(){
        return tempatLahir;
    }
    public String getTanggalLahir(){
        return tanggalLahir;
    }
    public String getAgama(){
        return agama;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public String getTelpon(){
        return telpon;
    }
    public String getEmail(){
        return email;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getPendidikan(){
        return pendidikan;
    }
    public String getStatus(){
        return status;
    }
    public String getJabatan(){
        return jabatan;
    }
    
}
