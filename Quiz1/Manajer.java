package Quiz1;

public class Manajer {
    private String nama;

    public Manajer(String nama) {
        this.nama = nama;
    }

    public void review(Proyek proyek) {
        System.out.println("Review oleh: " + nama);
        System.out.print(proyek.info());
        System.out.println("Progress: " + proyek.hitungProgress() + "%");
    }
}
