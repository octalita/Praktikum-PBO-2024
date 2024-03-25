package Posttest3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<kendaraan> kendaraan = new ArrayList<>();
        ArrayList<Motor> dataMotor = new ArrayList<>();
        ArrayList<Suku_Cadang> dataSuku_Cadang = new ArrayList<>();

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        while (true) {

            System.out.println("""
                    \nMenu
                    1. Tambah Data Motor
                    2. Lihat Data Motor
                    3. Ubah Data  Motor
                    4. Hapus Data Motor
                    5. Tambah Data Suku Cadang
                    6. Lihat Data Suku Cadang
                    7. Ubah Data  Suku Cadang
                    8. Hapus Data Suku Cadang
                    9. Keluar
                        """);

            System.out.print("Input :");
            int menu;
            try {
                menu = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("input salah!!. Input harus berupa angka.");
                continue;
            }

            switch (menu) {
                case 1:
                    String jenis_kendaraan;
                    do {
                        System.out.print("Masukkan Jenis Kendaraan : ");
                        jenis_kendaraan = br.readLine();
                        if (jenis_kendaraan.isEmpty()) {
                            System.out.println("Jenis Kendaraan tidak boleh kosong.");
                        } else if (jenis_kendaraan.matches("[0-9]+")) {
                            System.out.println("Jenis Kendaraan tidak boleh berupa angka.");
                        }
                    } while (jenis_kendaraan.isEmpty() || jenis_kendaraan.matches("[0-9]+"));

                    String nama;
                    do {
                        System.out.print("Masukkan Nama Motor : ");
                        nama  = br.readLine();
                        if (nama.isEmpty()) {
                            System.out.println("Nama Motor tidak boleh kosong.");
                        } else if (nama.matches("[0-9]+")) {
                            System.out.println("Nama Motor tidak boleh berupa angka.");
                        }
                    } while (nama.isEmpty() || nama.matches("[0-9]+"));

                    String merek;
                    do {
                        System.out.print("Masukkan Merek Motor : ");
                        merek = br.readLine();
                        if (merek.isEmpty()) {
                            System.out.println("Merek Motor tidak boleh kosong.");
                        } else if (merek.matches("[0-9]+")) {
                            System.out.println("Merek Motor tidak boleh berupa angka.");
                        }
                    } while (merek.isEmpty() || merek.matches("[0-9]+"));

                    String warna;
                    do {
                        System.out.print("Masukkan Warna  Motor : ");
                        warna = br.readLine();
                        if (warna.isEmpty()) {
                            System.out.println("Warna Motor tidak boleh kosong.");
                        } else if (warna.matches("[0-9]+")) {
                            System.out.println("Warna Motor tidak boleh berupa angka.");
                        }
                    } while (warna.isEmpty() || warna.matches("[0-9]+"));

                    int harga;
                    do {
                        try {
                            System.out.print("Masukkan Harga Motor : ");
                            harga = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    int cc;
                    do {
                        try {
                            System.out.print("Masukkan CC Motor : ");
                            cc = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    int tahun;
                    do {
                        try {
                            System.out.print("Masukkan Tahun Motor : ");
                            tahun = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    Motor mtrBaru = new Motor(jenis_kendaraan , nama, merek, warna, harga, cc, tahun);
                    dataMotor.add(mtrBaru);
                    break;

                case 2:
                    for (int i = 1; i <= dataMotor.size(); i++) {
                        System.out.println("Motor ke-" + i);
                        dataMotor.get(i - 1).tampil();
                        System.out.println("---------------------");
                    }
                    break;

                case 3:
                    for (int i = 1; i < dataMotor.size(); i++) {
                        System.out.println("Motor ke-" + i);
                        dataMotor.get(i).tampil();
                        System.out.println("---------------------");
                    }
                    System.out.print("Mau ubah data nomor berapa : ");
                    int ubah = Integer.parseInt(br.readLine()) - 1;

                    if (ubah <= dataMotor.size()) {
                        String Newsetjenis_kendaraan;
                        do {
                            System.out.print("Masukkan Jenis Kendaraan : ");
                            Newsetjenis_kendaraan= br.readLine();
                            if (Newsetjenis_kendaraan.isEmpty()) {
                                System.out.println("Jenis Kendaraan tidak boleh kosong.");
                            } else if (Newsetjenis_kendaraan.matches("[0-9]+")) {
                                System.out.println("Jenis Kendaraan  tidak boleh berupa angka.");
                            }
                        } while (Newsetjenis_kendaraan.isEmpty() || Newsetjenis_kendaraan.matches("[0-9]+"));

                        String Newsetnama;
                        do {
                            System.out.print("Masukkan Nama Baru Motor : ");
                            Newsetnama = br.readLine();
                            if (Newsetnama.isEmpty()) {
                                System.out.println("Nama Baru Motor tidak boleh kosong.");
                            } else if (Newsetnama.matches("[0-9]+")) {
                                System.out.println("Nama Baru Motor tidak boleh berupa angka.");
                            }
                        } while (Newsetnama.isEmpty() || Newsetnama.matches("[0-9]+"));

                        String Newsetmerek;
                        do {
                            System.out.print("Masukkan Merek Baru Motor : ");
                            Newsetmerek = br.readLine();
                            if (Newsetmerek.isEmpty()) {
                                System.out.println("Merek Baru Motor tidak boleh kosong.");
                            } else if (Newsetmerek.matches("[0-9]+")) {
                                System.out.println("Merek Baru Motor tidak boleh berupa angka.");
                            }
                        } while (Newsetmerek.isEmpty() || Newsetmerek.matches("[0-9]+"));

                        String Newsetwarna;
                        do {
                            System.out.print("Masukkan Warna Baru Motor : ");
                            Newsetwarna = br.readLine();
                            if (Newsetwarna.isEmpty()) {
                                System.out.println("Warna Baru Motor tidak boleh kosong.");
                            } else if (Newsetwarna.matches("[0-9]+")) {
                                System.out.println("Warna Baru Motor tidak boleh berupa angka.");
                            }
                        } while (Newsetwarna.isEmpty() || Newsetwarna.matches("[0-9]+"));

                        int Newsetharga;
                        do {
                            try {
                                System.out.print("Masukkan Harga Motor Baru: ");
                                Newsetharga = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        int Newsetcc;
                        do {
                            try {
                                System.out.print("Masukkan CC  Motor Baru : ");
                                Newsetcc = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        int Newsettahun;
                        do {
                            try {
                                System.out.print("Masukkan Tahun Motor Baru : ");
                                Newsettahun = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        kendaraan.get(ubah).setjenis_kendaraan(Newsetjenis_kendaraan);
                        dataMotor.get(ubah).setNama(Newsetnama);
                        dataMotor.get(ubah).setMerek(Newsetmerek);
                        dataMotor.get(ubah).setWarna(Newsetwarna);
                        dataMotor.get(ubah).setHarga(Newsetharga);
                        dataMotor.get(ubah).setCc(Newsetcc);
                        dataMotor.get(ubah).setTahun(Newsettahun);
                        ;
                    } else {
                        System.out.println("Nomor yang anda masukkan tidak ada");
                    }
                    break;

                case 4:
                    for (int i = 1; i <= dataMotor.size(); i++) {
                        System.out.println("Motor ke-" + i);
                        dataMotor.get(i - 1).tampil();
                        System.out.println("---------------------");
                    }
                    System.out.print("Mau hapus data motor berapa : ");
                    int hapusIndex = Integer.parseInt(br.readLine()) - 1;

                    // Periksa apakah indeks hapus berada dalam batas aman array
                    if (hapusIndex >= 0 && hapusIndex < dataMotor.size()) {
                        dataMotor.remove(hapusIndex);
                        System.out.println("Motor berhasil dihapus.");
                    } else {
                        System.out.println("Input yang anda masukkan tidak ada");
                    }
                    break;

                    case 5:
                    String jenis_Kendaraan;
                    do {
                        System.out.print("Masukkan Jenis Kendaraan : ");
                        jenis_kendaraan = br.readLine();
                        if (jenis_kendaraan.isEmpty()) {
                            System.out.println("Jenis Kendaraan  tidak boleh kosong.");
                        } else if (jenis_kendaraan.matches("[0-9]+")) {
                            System.out.println("Jenis Kendaraaan tidak boleh berupa angka.");
                        }
                    } while (jenis_kendaraan.isEmpty() || jenis_kendaraan.matches("[0-9]+"));

                    String namasukucadang;
                    do {
                        System.out.print("Masukkan Nama Suku Cadang : ");
                        namasukucadang = br.readLine();
                        if (namasukucadang.isEmpty()) {
                            System.out.println("Nama Suku Cadang tidak boleh kosong.");
                        } else if (namasukucadang.matches("[0-9]+")) {
                            System.out.println("Nama Suku Cadang tidak boleh berupa angka.");
                        }
                    } while (namasukucadang.isEmpty() || namasukucadang.matches("[0-9]+"));

                    String mereksukucadang;
                    do {
                        System.out.print("Masukkan Merek Suku Cadang : ");
                        mereksukucadang = br.readLine();
                        if (mereksukucadang.isEmpty()) {
                            System.out.println("Merek Suku Cadang tidak boleh kosong.");
                        } else if (mereksukucadang.matches("[0-9]+")) {
                            System.out.println("Merek Suku Cadang tidak boleh berupa angka.");
                        }
                    } while (mereksukucadang.isEmpty() || mereksukucadang.matches("[0-9]+"));

                    String model;
                    do {
                        System.out.print("Masukkan Model Suku Cadang : ");
                        model = br.readLine();
                        if (model.isEmpty()) {
                            System.out.println("Model Suku Cadang tidak boleh kosong.");
                        } else if (model.matches("[0-9]+")) {
                            System.out.println("Model Suku Cadang tidak boleh berupa angka.");
                        }
                    } while (model.isEmpty() || model.matches("[0-9]+"));

                    int hargasukucadang;
                    do {
                        try {
                            System.out.print("Masukkan Harga Suku Cadang : ");
                            hargasukucadang = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    int jumlah;
                    do {
                        try {
                            System.out.print("Masukkan Jumlah Suku Cadang : ");
                            jumlah = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    int tahunsukucadang;
                    do {
                        try {
                            System.out.print("Masukkan Tahun Suku Cadang : ");
                            tahunsukucadang = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    Suku_Cadang scBaru = new Suku_Cadang(jenis_kendaraan,namasukucadang, mereksukucadang, model, hargasukucadang, jumlah, tahunsukucadang);
                    dataSuku_Cadang.add(scBaru);
                    break;

                case 6:
                    for (int i = 1; i <= dataSuku_Cadang.size(); i++) {
                        System.out.println("Suku Cadang ke-" + i);
                        dataSuku_Cadang.get(i - 1).tampil();
                        System.out.println("---------------------");
                    }
                    break;
                
                case 7:
                for (int i = 1; i < dataSuku_Cadang.size(); i++) {
                    System.out.println("Suku Cadang ke-" + i);
                    dataMotor.get(i).tampil();
                    System.out.println("---------------------");
                }
                System.out.print("Mau ubah data nomor berapa : ");
                int Ubah = Integer.parseInt(br.readLine()) - 1;

                if (Ubah <= dataSuku_Cadang.size()) {
                    String Newsetjenis_kendaraan;
                    do {
                        System.out.print("Masukkan Nama Baru Suku Cadang : ");
                        Newsetjenis_kendaraan = br.readLine();
                        if (Newsetjenis_kendaraan.isEmpty()) {
                            System.out.println("Nama Baru Motor tidak boleh kosong.");
                        } else if (Newsetjenis_kendaraan.matches("[0-9]+")) {
                            System.out.println("Nama Baru Motor tidak boleh berupa angka.");
                        }
                    } while (Newsetjenis_kendaraan.isEmpty() || Newsetjenis_kendaraan.matches("[0-9]+"));

                    String Newsetnamasukucadang;
                    do {
                        System.out.print("Masukkan Nama Baru Suku Cadang : ");
                        Newsetnamasukucadang = br.readLine();
                        if (Newsetnamasukucadang.isEmpty()) {
                            System.out.println("Nama Baru Motor tidak boleh kosong.");
                        } else if (Newsetnamasukucadang.matches("[0-9]+")) {
                            System.out.println("Nama Baru Motor tidak boleh berupa angka.");
                        }
                    } while (Newsetnamasukucadang.isEmpty() || Newsetnamasukucadang.matches("[0-9]+"));

                    String Newsetmereksukucadang;
                    do {
                        System.out.print("Masukkan Merek Baru Suku Cadang : ");
                        Newsetmereksukucadang = br.readLine();
                        if (Newsetmereksukucadang.isEmpty()) {
                            System.out.println("Merek Baru Suku Cadang tidak boleh kosong.");
                        } else if (Newsetmereksukucadang.matches("[0-9]+")) {
                            System.out.println("Merek Baru Motor tidak boleh berupa angka.");
                        }
                    } while (Newsetmereksukucadang.isEmpty() || Newsetmereksukucadang.matches("[0-9]+"));

                    String Newsetmodel;
                    do {
                        System.out.print("Masukkan Warna Baru Motor : ");
                        Newsetmodel = br.readLine();
                        if (Newsetmodel.isEmpty()) {
                            System.out.println("Model Baru Suku Cadang tidak boleh kosong.");
                        } else if (Newsetmodel.matches("[0-9]+")) {
                            System.out.println("Model Baru Suku Cadang tidak boleh berupa angka.");
                        }
                    } while (Newsetmodel.isEmpty() || Newsetmodel.matches("[0-9]+"));

                    int Newsethargasukucadang;
                    do {
                        try {
                            System.out.print("Masukkan Harga Suku Cadang Baru: ");
                            Newsethargasukucadang = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    int Newsetjumlah;
                    do {
                        try {
                            System.out.print("Masukkan Jumlah Suku Cadang Baru : ");
                            Newsetjumlah = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    int Newsettahunsukucadang;
                    do {
                        try {
                            System.out.print("Masukkan Tahun Suku Cadang Baru : ");
                            Newsettahunsukucadang = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    kendaraan.get(Ubah).setjenis_kendaraan(Newsetjenis_kendaraan);
                    dataSuku_Cadang.get(Ubah).setNamasukucadang(Newsetnamasukucadang);
                    dataSuku_Cadang.get(Ubah).setMereksukucadang(Newsetmereksukucadang);
                    dataSuku_Cadang.get(Ubah).setModel(Newsetmodel);
                    dataSuku_Cadang.get(Ubah).setHargasukucadang(Newsethargasukucadang);
                    dataSuku_Cadang.get(Ubah).setJumlah(Newsetjumlah);
                    dataSuku_Cadang.get(Ubah).setTahunsukucadang(Newsettahunsukucadang);
                    ;
                } else {
                    System.out.println("Nomor yang anda masukkan tidak ada");
                }
                break;

                

                case 8:
                    for (int i = 1; i <= dataSuku_Cadang.size(); i++) {
                        System.out.println("Suku Cadang ke-" + i);
                        dataSuku_Cadang.get(i - 1).tampil();
                        System.out.println("---------------------");
                    }
                    System.out.print("Mau hapus data Suku Cadang berapa : ");
                    int HapusIndex = Integer.parseInt(br.readLine()) - 1;

                    // Periksa apakah indeks hapus berada dalam batas aman array
                    if (HapusIndex >= 0 && HapusIndex < dataSuku_Cadang.size()) {
                        dataMotor.remove(HapusIndex);
                        System.out.println("Suku Cadang berhasil dihapus.");
                    } else {
                        System.out.println("Input yang anda masukkan tidak ada");
                    }
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Input yang anda masukkan tidak ada");

            }
        }

    }

}


