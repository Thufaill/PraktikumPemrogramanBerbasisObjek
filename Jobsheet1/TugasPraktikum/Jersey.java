package Jobsheet1.TugasPraktikum;

public class Jersey extends Pakaian {

    // Atribut
    private String namaPemain;
    private int nomorPunggung;

    // Constructor
    public Jersey(String bahan, String ukuran,
            String namaPemain, int nomorPunggung) {

        // Memanggil constructor class Pakaian
        super(bahan, ukuran);

        this.namaPemain = namaPemain;
        this.nomorPunggung = nomorPunggung;
    }

    // Method 1
    public void cetakNomor() {
        System.out.println("Nomor punggung jersey: " + nomorPunggung);
    }

    // Method 2
    public void cetakNama() {
        System.out.println("Nama pemain pada jersey: " + namaPemain);
    }

    // Method 3
    @Override
    public void cetakInfo() {
        System.out.println("=== INFORMASI JERSEY ===");
        System.out.println("Bahan          : " + bahan);
        System.out.println("Ukuran         : " + ukuran);
        System.out.println("Nama Pemain    : " + namaPemain);
        System.out.println("Nomor Punggung : " + nomorPunggung);
    }
}