package Postest2;

public class Suku_Cadang {

    public String namasukucadang, mereksukucadang, model;
    public int hargasukucadang, jumlah, tahunsukucadang;

    public Suku_Cadang(String namasukucadang, String mereksukucadang, String model, int hargasukucadang, int jumlah,
            int tahunsukucadang) {
        this.namasukucadang = namasukucadang;
        this.mereksukucadang = mereksukucadang;
        this.model = model;
        this.hargasukucadang = hargasukucadang;
        this.jumlah = jumlah;
        this.tahunsukucadang = tahunsukucadang;
    }

    // Getter dan setter

    public String getNamasukucadang() {
        return namasukucadang;
    }

    public void setNamasukucadang(String namasukucadang) {
        this.namasukucadang = namasukucadang;
    }

    public String getMereksukucadang() {
        return mereksukucadang;
    }

    public void setMereksukucadang(String mereksukucadang) {
        this.mereksukucadang = mereksukucadang;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHargasukucadang() {
        return hargasukucadang;
    }

    public void setHargasukucadang(int hargasukucadang) {
        this.hargasukucadang = hargasukucadang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTahunsukucadang() {
        return tahunsukucadang;
    }

    public void setTahunsukucadang(int tahunsukucadang) {
        this.tahunsukucadang = tahunsukucadang;
    }

    void tampil() {
        System.out.println("Nama : " + this.namasukucadang);
        System.out.println("Merek : " + this.mereksukucadang);
        System.out.println("Model : " + this.model);
        System.out.println("Harga : " + this.hargasukucadang);
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Tahun: " + this.tahunsukucadang);
    }

   
    }

