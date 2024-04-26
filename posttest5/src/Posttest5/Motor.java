package Posttest5;

// Motor class extending Kendaraan
public class Motor  {
    private String warna;
    private int cc;

    // Constructor
    protected  Motor(String nama, String merek, String warna, int harga, int tahun, int cc) {
        super(nama, merek, harga, tahun);
        this.warna = warna;
        this.cc = cc;
    }

    // Getters and Setters
    protected String getWarna() {
        return warna;
    }

    protected void setWarna(String warna) {
        this.warna = warna;
    }

    protected int getCc() {
        return cc;
    }

    protected void setCc(int cc) {
        this.cc = cc;
    }

    // Method override from Kendaraan class
    @Override
    protected void tampil() {
        System.out.println("Nama: " + getNama());
        System.out.println("Merek: " + getMerek());
        System.out.println("Warna: " + this.warna);
        System.out.println("CC: " + this.cc);
    }
}