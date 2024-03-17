package Postest1;

public class Motor {

    String nama, merek, warna;
    int harga, cc, tahun;

    public Motor(String nama, String merek, String warna, int harga, int cc, int tahun) {
        this.nama = nama;
        this.merek = merek;
        this.warna = warna;
        this.harga = harga;
        this.cc = cc;
        this.tahun = tahun;
    }

    void tampil() {
        System.out.println("Nama : "+ this.nama);
        System.out.println("Merek : "+ this.merek);
        System.out.println("Warna : "+ this.warna);
        System.out.println("Harga : "+ this.harga);
        System.out.println("CC : "+ this.cc);
        System.out.println("Tahun: "+ this.tahun);

     
        
    }
}
