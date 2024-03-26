package Posttest3;

public class Suku_Cadang extends kendaraan {

    private String  model;
    private int jumlah;

    public Suku_Cadang( String nama, String merek, String model, int harga, int jumlah,
            int tahun) {
        super(nama, merek, harga, tahun);
        this.model = model;
        this.jumlah = jumlah;
        
    }

    // Getter dan setter

   

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

   
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

  
 

    void tampil() {
    
        System.out.println("Nama : " + super.getnama());
        System.out.println("Merek : " + super.getmerek());
        System.out.println("Model : " + this.model);
        System.out.println("Harga : " + super.getharga());
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Tahun: " + super.gettahun());
    }

   
    }

