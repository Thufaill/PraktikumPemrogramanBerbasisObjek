package Jobsheet1.TugasPraktikum;

public class Kemeja extends Pakaian {

    // Atribut
    private String tipeLengan;
    private int jumlahKancing;

    // Constructor
    public Kemeja(String bahan, String ukuran,
            String tipeLengan, int jumlahKancing) {

        // Memanggil constructor Pakaian
        super(bahan, ukuran);

        this.tipeLengan = tipeLengan;
        this.jumlahKancing = jumlahKancing;
    }

    // Method 1
    public void kancingkan() {
        System.out.println("Kemeja sedang dikancingkan.");
    }

    // Method 2
    public void disetrika() {
        System.out.println("Kemeja sedang disetrika.");
    }

    // Method 3
    @Override
    public void cetakInfo() {
        System.out.println("=== INFORMASI KEMEJA ===");
        System.out.println("Bahan         : " + bahan);
        System.out.println("Ukuran        : " + ukuran);
        System.out.println("Tipe Lengan   : " + tipeLengan);
        System.out.println("Jumlah Kancing: " + jumlahKancing);
    }
}