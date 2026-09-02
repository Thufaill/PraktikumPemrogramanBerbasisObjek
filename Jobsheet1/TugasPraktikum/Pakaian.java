package Jobsheet1.TugasPraktikum;

public class Pakaian {

    // Atribut
    protected String bahan;
    protected String ukuran;

    // Constructor
    public Pakaian(String bahan, String ukuran) {
        this.bahan = bahan;
        this.ukuran = ukuran;
    }

    // Method 1
    public void dipakai() {
        System.out.println("Pakaian sedang dipakai.");
    }

    // Method 2
    public void dicuci() {
        System.out.println("Pakaian sedang dicuci.");
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("=== INFORMASI PAKAIAN ===");
        System.out.println("Bahan  : " + bahan);
        System.out.println("Ukuran : " + ukuran);
    }
}