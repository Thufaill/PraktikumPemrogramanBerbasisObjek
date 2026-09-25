package Jobsheet4.TugasMandiri;

public class Restoran {
    private String nama;
    private Koki koki;          // Aggregation (disimpan sebagai field)
    private Dapur dapur;        // Composition (disimpan sebagai field)

    public Restoran(String nama) {
        this.nama = nama;
        // Penanda COMPOSITION: Dapur di-instansiasi langsung di dalam constructor
        this.dapur = new Dapur(); 
    }

    // Penanda AGGREGATION: Koki disuntikkan dari luar via setter
    public void setKoki(Koki koki) {
        this.koki = koki;
    }

    // Penanda DEPENDENCY: Struk hanya lewat sebagai parameter method
    public void buatPesanan(String pesanan, Struk struk) {
        System.out.println("Restoran " + nama + " menyiapkan pesanan.");
        System.out.println("Dapur memakai: " + dapur.getPeralatan());
        
        if (koki != null) {
            System.out.println("Dimasak oleh Koki: " + koki.getNama());
        }
        
        // Memanggil method objek Struk (Uses-A)
        struk.cetak(this.nama, pesanan); 
    }
}