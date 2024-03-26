package Posttest3;


public class kendaraan {
    String   nama, merek  ;
    int harga, tahun ;

    public kendaraan (String nama, String merek, int harga, int tahun ) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
        this.tahun = tahun;
        
      
        
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama  = nama;
   
}  
    public String getmerek() {
        return merek;
    }

    public void setmerek(String merek) {
        this.merek  = merek;
   
}  
    public int getharga() {
        return harga;
    }

    public void setharga(int harga) {
        this.harga  = harga;
   
}  
    public int gettahun() {
        return tahun;
    }

    public void settahun(int tahun) {
        this.tahun  = tahun;
   
}  







}