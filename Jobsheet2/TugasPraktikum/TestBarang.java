package Jobsheet2.TugasPraktikum;

public class TestBarang {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.kode = "JA01";
        b1.namaBarang = "Jersey Apparel";
        b1.hargaDasar = 250000;
        b1.diskon = 0.1f; 

        b1.tampilData();
    }
}