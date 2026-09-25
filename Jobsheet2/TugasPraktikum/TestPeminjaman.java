package Jobsheet2.TugasPraktikum;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pjm = new Peminjaman();
        pjm.id = 969;
        pjm.namaMember = "Javier";
        pjm.namaGame = "Free Fire";
        pjm.harga = 25000;
        pjm.lamaSewa = 3;

        pjm.tampilData();
    }
}
