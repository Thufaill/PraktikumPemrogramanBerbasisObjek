package Jobsheet1.TugasPraktikum;

public class Gunting {

    // Atribut
    private String bahan;
    private String warnaGagang;

    // Constructor
    public Gunting(String bahan, String warnaGagang) {
        this.bahan = bahan;
        this.warnaGagang = warnaGagang;
    }

    // Method 1
    public void potong() {
        System.out.println("Gunting digunakan untuk memotong.");
    }

    // Method 2
    public void asah() {
        System.out.println("Gunting sedang diasah agar tetap tajam.");
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("=== INFORMASI GUNTING ===");
        System.out.println("Bahan       : " + bahan);
        System.out.println("Warna Gagang: " + warnaGagang);
    }
}
