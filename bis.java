package com.mycompany.posttest1;

public class bis {
    String waktu;
    String tipe;
    int    jam;
    int    harga;
    
    public bis (String waktu, int jam, String tipe, int harga){
        this.waktu = waktu;
        this.jam   = jam;
        this.tipe  = tipe;
        this.harga = harga;
    }
    
    public String getWaktu(){
        return waktu;
    }
    
    public int getJam(){
        return jam;
    }
    
    public String getTipe(){
        return tipe;
    }
    
    public int getHarga(){
        return harga;
    }
}
