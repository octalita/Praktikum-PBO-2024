package Posttest5;

// Suku_Cadang class extending Kendaraan
public class Suku_Cadang extends Kendaraan {
    private String model;
    private int jumlah;

    // Constructor
    protected Suku_Cadang(String nama, String merek, String model, int harga, int jumlah, int tahun) {
        super(nama, merek, harga, tahun);
        this.model = model;
        this.jumlah = jumlah;
    }

    // Getters and Setters
    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected int getJumlah() {
        return jumlah;
    }

    protected void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Method override from Kendaraan class
    @Override
    protected void tampil() {
        System.out.println("Nama: " + getNama());
        System.out.println("Merek: " + getMerek());
        System.out.println("Model: " + this.model);
        System.out.println("Harga: " + getHarga());
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Tahun: " + getTahun());
    }
}