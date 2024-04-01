package Posttest4;

import Posttest4.kendaraan;
 class Motor extends kendaraan  {

    // Private members
    private String warna;
    private int cc;

    // Constructor
    public Motor( String nama,String merek,String warna,int harga,int tahun, int cc ) {
        super(nama, merek, harga, tahun);
        this.warna = warna;
        this.cc = cc;
        
    }

    // Getters and Setters
 

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

   

    public int getCc() {
        return this.cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    // metode override dari class kendaraan
    @Override
    public void tampil() {
        System.out.println("Nama : " + super.getnama());
        System.out.println("Merek : " + super.getmerek());
        System.out.println("Warna : " + this.warna);
        System.out.println("Harga : " + super.getharga());
        System.out.println("CC: " + this.cc);
        System.out.println("Tahun: " + super.gettahun());
    }
    


    
   
}
