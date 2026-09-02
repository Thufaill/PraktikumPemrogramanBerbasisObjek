package Jobsheet1.TugasPraktikum;

public class Parfum {

    // Atribut
    private String merk;
    private String aroma;

    // Constructor
    public Parfum(String merk, String aroma) {
        this.merk = merk;
        this.aroma = aroma;
    }

    // Method 1
    public void semprot() {
        System.out.println("Parfum " + merk + " sedang disemprotkan.");
    }

    // Method 2
    public void isiUlang() {
        System.out.println("Parfum " + merk + " sedang diisi ulang.");
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("=== INFORMASI PARFUM ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Aroma : " + aroma);
    }
}
