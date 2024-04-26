package Posttest5;

// Abstract class
public abstract class kendaraan {
    private String nama;
    private String merek;
    private int harga;
    private int tahun;

    // Constructor
    public Kendaraan(String nama, String merek, int harga, int tahun) {
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