package Jobsheet3.TugasPraktikum;

public class TestBioskop {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("Inside Out 2", -50000);
        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: Rp" + tiket1.getHargaDasar());
        System.out.println("Status Lunas? " + tiket1.getStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket1.getStatusPembayaran());
    }
}