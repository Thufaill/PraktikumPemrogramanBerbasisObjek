package Jobsheet2.TugasPraktikum;

public class Barang {
    public String kode;
    public String namaBarang;
    public double hargaDasar;
    public float diskon;

    public double hitungHargaJual() {
        double hargaJual = hargaDasar + (diskon * hargaDasar);
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp " + hargaDasar);
        System.out.println("Diskon      : " + (diskon * 100) + "%");
        System.out.println("Harga Jual  : Rp " + hitungHargaJual());
    }
}