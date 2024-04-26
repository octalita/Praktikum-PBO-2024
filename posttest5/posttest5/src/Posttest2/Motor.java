package Postest2;

public class Motor extends Main {

    // Private members
    private String nama, merek, warna;
    private int harga, cc, tahun;

    // Constructor
    public Motor(String nama, String merek, String warna, int harga, int cc, int tahun) {
        this.nama = nama;
        this.merek = merek;
        this.warna = warna;
        this.harga = harga;
        this.cc = cc;
        this.tahun = tahun;
    }

    // Getters and Setters
 
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return this.merek;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getCc() {
        return this.cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getTahun() {
        return this.tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Default access modifier (package-private)
    void tampil() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Merek : " + this.merek);
        System.out.println("Warna : " + this.warna);
        System.out.println("Harga : " + this.harga);
        System.out.println("CC : " + this.cc);
        System.out.println("Tahun: " + this.tahun);
    }

    // Public access modifier
   
}
