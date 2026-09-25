package Jobsheet3.TugasPraktikum;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
        this.statusPembayaran = false;
    }

    public String getJudulFilm() { return judulFilm; }
    public double getHargaDasar() { return hargaDasar; }
    public boolean getStatusPembayaran() { return statusPembayaran; }

    public void lakukanPembayaran() {
        this.statusPembayaran = true;
        System.out.println("Pembayaran berhasil dilakukan.");
    }
}