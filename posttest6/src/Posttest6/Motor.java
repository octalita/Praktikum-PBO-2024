package Posttest6;


// Motor class implementing Printable interface
public class Motor extends kendaraan implements Printable {
    private String warna;
    private int cc;

    // Constructor
    public Motor(String nama, String merek, String warna, int harga, int cc, int tahun) {
        super(nama, merek, harga, tahun, );
        this.warna = warna;
        this. nama = nama;
        this.merek = merek;
        this.harga = harga;
        this.tahun = tahun;
        
    }

    // Implementing abstract method from kendaraan class
    @Override
    public void tampil() {
        System.out.println("Nama: " + getNama());
        System.out.println("Merek: " + getMerek());
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + getHarga());
        System.out.println("CC: " + cc);
        System.out.println("Tahun: " + getTahun());
    }

    // Implementing methods from Printable interface
    @Override
    public void print() {
        System.out.println("Printing motor details...");
        tampil();  // Reuse tampil() method for printing
    }

    @Override
    public void show() {
        System.out.println("Showing motor details...");
        tampil();  // Reuse tampil() method for showing
    }
}
