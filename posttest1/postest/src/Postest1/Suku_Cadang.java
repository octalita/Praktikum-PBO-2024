package Postest1;

public class Suku_Cadang {

    
    String namasukucadang, mereksukucadang, model;
    int hargasukucadang, jumlah, tahunsukucadang;

    public Suku_Cadang(String namasukucadang, String mereksukucadang, String model, int hargasukucadang, int jumlah, int tahunsukucadang) {
        this.namasukucadang = namasukucadang;
        this.mereksukucadang = mereksukucadang;
        this.model = model;
        this.hargasukucadang = hargasukucadang;
        this.jumlah = jumlah;
        this.tahunsukucadang = tahunsukucadang;
    }

    void tampil() {
        System.out.println("Nama : "+ this.namasukucadang);
        System.out.println("Merek : "+ this.mereksukucadang);
        System.out.println("Model : "+ this.model);
        System.out.println("Harga : "+ this.hargasukucadang);
        System.out.println("Jumlah: "+ this.jumlah);
        System.out.println("Tahun: "+ this.tahunsukucadang);

     
        
    }
}

    

