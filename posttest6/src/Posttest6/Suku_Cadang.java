package Posttest6;

// Suku_Cadang class extending Kendaraan
public class Suku_Cadang extends kendaraan {
    private String model;
    private int jumlah;

    // Constructor for Suku_Cadang
    public Suku_Cadang(String nama, String merek, String model, int harga, int jumlah, int tahun) {
        super(nama,merek, harga, tahun);
        this.model = model;
        this.jumlah = jumlah;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for jumlah
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Method to display Suku_Cadang details
    @Override
    public void tampil() {
        System.out.println("Nama: " + getNama());
        System.out.println("Merek: " + getMerek());
        System.out.println("Model: " + model);
        System.out.println("Harga: " + getHarga());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Tahun: " + getTahun());
    }
}
