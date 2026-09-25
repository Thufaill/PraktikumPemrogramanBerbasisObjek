package Quiz1;

public class Main {
    public static void main(String[] args) {

        Proyek proyek = new Proyek("Aplikasi SIAKAD", 3);
        System.out.println("Aplikasi SIAKAD:");

        proyek.tambahTugas("Desain Database", 30);
        proyek.tambahTugas("Modul Login", 20);
        proyek.tambahTugas("Modul KRS", 50);
        proyek.tambahTugas("Modul Nilai", 40);

        Programmer dimas = new Programmer("Dimas", "Backend");
        Programmer laras = new Programmer("Laras", "Frontend");

        proyek.tugaskan(1, dimas);
        proyek.tugaskan(2, laras);
        proyek.tugaskan(5, dimas);

        proyek.getDaftarTugas()[0].tandaSelesai();
        proyek.getDaftarTugas()[1].tandaSelesai();

        Manajer manajer = new Manajer("Pak Rudi");

        manajer.review(proyek);
    }
}
