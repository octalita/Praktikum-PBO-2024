package Postest1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws Exception {
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
                    String nama;
                    do {
                        System.out.print("Masukkan Nama Motor : ");
                        nama = br.readLine();
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

                    Motor mtrBaru = new Motor(nama, merek, warna, harga, cc, tahun);
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
                    for (int i = 0; i < dataMotor.size(); i++) {
                        System.out.println("Motor ke-" + i);
                        dataMotor.get(i).tampil();
                        System.out.println("---------------------");
                    }
                    System.out.print("Mau ubah data nomor berapa : ");
                    int ubah = Integer.parseInt(br.readLine()) - 1;

                    if (ubah <= dataMotor.size()) {
                        String Newnama;
                        do {
                            System.out.print("Masukkan Nama Baru Motor : ");
                            Newnama = br.readLine();
                            if (Newnama.isEmpty()) {
                                System.out.println("Nama Baru Motor tidak boleh kosong.");
                            } else if (Newnama.matches("[0-9]+")) {
                                System.out.println("Nama Baru Motor tidak boleh berupa angka.");
                            }
                        } while (Newnama.isEmpty() || Newnama.matches("[0-9]+"));

                        String Newmerek;
                        do {
                            System.out.print("Masukkan Merek Baru Motor : ");
                            Newmerek = br.readLine();
                            if (Newmerek.isEmpty()) {
                                System.out.println("Merek Baru Motor tidak boleh kosong.");
                            } else if (Newmerek.matches("[0-9]+")) {
                                System.out.println("Merek Baru Motor tidak boleh berupa angka.");
                            }
                        } while (Newmerek.isEmpty() || Newmerek.matches("[0-9]+"));

                        String Newwarna;
                        do {
                            System.out.print("Masukkan Warna Baru Motor : ");
                            Newwarna = br.readLine();
                            if (Newwarna.isEmpty()) {
                                System.out.println("Warna Baru Motor tidak boleh kosong.");
                            } else if (Newwarna.matches("[0-9]+")) {
                                System.out.println("Warna Baru Motor tidak boleh berupa angka.");
                            }
                        } while (Newwarna.isEmpty() || Newwarna.matches("[0-9]+"));

                        int Newharga;
                        do {
                            try {
                                System.out.print("Masukkan Harga Motor Baru: ");
                                Newharga = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        int Newcc;
                        do {
                            try {
                                System.out.print("Masukkan CC  Motor Baru : ");
                                Newcc = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        int Newtahun;
                        do {
                            try {
                                System.out.print("Masukkan Tahun Motor Baru : ");
                                Newtahun = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        dataMotor.get(ubah).nama = Newnama;
                        dataMotor.get(ubah).merek = Newmerek;
                        dataMotor.get(ubah).warna = Newwarna;
                        dataMotor.get(ubah).harga = Newharga;
                        dataMotor.get(ubah).cc = Newcc;
                        dataMotor.get(ubah).tahun = Newtahun;
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

                    int tahunsukucadang = Integer.parseInt(br.readLine()); //
                    do {
                        try {
                            System.out.print("Masukkan Tahun Suku Cadang : ");
                            tahunsukucadang = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("input salah!!. Input harus berupa angka.");
                        }
                    } while (true);

                    Suku_Cadang scBaru = new Suku_Cadang(namasukucadang, mereksukucadang, model, hargasukucadang, jumlah, tahunsukucadang);
                    dataSuku_Cadang.add(scBaru);
                    break;

                case 6:
                    for (int i = 1; i <= dataSuku_Cadang.size(); i++) {
                        System.out.println("Suku Cadang ke-" + i);
                        dataSuku_Cadang.get(i - 1).tampil();
                        System.out.println("---------------------");
                    }
                    break;

                case 7 :
                    for (int i = 0; i < dataSuku_Cadang.size(); i++) {
                        System.out.println("Suku Cadang ke-" + i);
                        dataSuku_Cadang.get(i).tampil();
                        System.out.println("---------------------");
                    }
                    System.out.print("Mau ubah data nomor berapa : ");
                    int Ubah = Integer.parseInt(br.readLine()) - 1;

                    if (Ubah <= dataSuku_Cadang.size()) {
                        String Newnamasukucadang;
                        do {
                            System.out.print("Masukkan Nama Suku Cadang Baru : ");
                            Newnamasukucadang = br.readLine();
                            if (Newnamasukucadang.isEmpty()) {
                                System.out.println("Nama Baru Suku Cadang tidak boleh kosong.");
                            } else if (Newnamasukucadang.matches("[0-9]+")) {
                                System.out.println("Nama Baru Suku Cadang tidak boleh berupa angka.");
                            }
                        } while (Newnamasukucadang.isEmpty() || Newnamasukucadang.matches("[0-9]+"));

                        String Newmereksukucadang;
                        do {
                            System.out.print("Masukkan Merek Suku Cadang Baru : ");
                            Newmereksukucadang = br.readLine();
                            if (Newmereksukucadang.isEmpty()) {
                                System.out.println("Merek Suku Cadang Baru tidak boleh kosong.");
                            } else if (Newmereksukucadang.matches("[0-9]+")) {
                                System.out.println("Merek Suku Cadang Baru tidak boleh berupa angka.");
                            }
                        } while (Newmereksukucadang.isEmpty() || Newmereksukucadang.matches("[0-9]+"));

                        String Newmodel;
                        do {
                            System.out.print("Masukkan Model Suku Cadang  Baru : ");
                            Newmodel = br.readLine();
                            if (Newmodel.isEmpty()) {
                                System.out.println("Model Suku Cadang Baru tidak boleh kosong.");
                            } else if (Newmodel.matches("[0-9]+")) {
                                System.out.println("Warna Baru tidak boleh berupa angka.");
                            }
                        } while (Newmodel.isEmpty() || Newmodel.matches("[0-9]+"));

                        int Newhargasukucadang;
                        do {
                            try {
                                System.out.print("Masukkan Harga Suku Cadang Baru: ");
                                Newhargasukucadang = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        int Newjumlah;
                        do {
                            try {
                                System.out.print("Masukkan Jumlah Suku Cadang : ");
                                Newjumlah = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        int Newtahunsukucadang;
                        do {
                            try {
                                System.out.print("Masukkan Tahun Suku Cadang : ");
                                Newtahunsukucadang = Integer.parseInt(br.readLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("input salah!!. Input harus berupa angka.");
                            }
                        } while (true);

                        dataMotor.get(Ubah).nama = Newnamasukucadang;
                        dataMotor.get(Ubah).merek = Newmereksukucadang;
                        dataMotor.get(Ubah).warna = Newmodel;
                        dataMotor.get(Ubah).harga = Newhargasukucadang;
                        dataMotor.get(Ubah).cc = Newjumlah;
                        dataMotor.get(Ubah).tahun = Newtahunsukucadang;
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
