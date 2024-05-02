package Posttest6;

// Abstract class
public abstract class kendaraan {
    public String nama;
    public String merek;
    public int harga;
    public int tahun;

    // Constructor
    public kendaraan(nama, merek, harga, tahun) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
        this.tahun = tahun;
    }

    // Abstract method to be implemented by subclasses
    public abstract void tampil();

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}