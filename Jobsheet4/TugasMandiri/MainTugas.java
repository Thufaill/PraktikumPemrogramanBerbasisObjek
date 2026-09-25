package Jobsheet4.TugasMandiri;

public class MainTugas {
    public static void main(String[] args) {
        Koki koki = new Koki("Chef Juna");
        Restoran resto = new Restoran("Gourmet Nusantara");
        
        resto.setKoki(koki); // Aggregation
        
        Struk s = new Struk();
        resto.buatPesanan("Nasi Goreng Spesial", s); // Dependency
    }
}