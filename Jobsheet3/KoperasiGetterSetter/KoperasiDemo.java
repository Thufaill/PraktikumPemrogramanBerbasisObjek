package Jobsheet3.KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta No 10");
        anggota1.setor(100000);

        System.out.println("Nama Anggota  : " + anggota1.getNama());
        System.out.println("Alamat        : " + anggota1.getAlamat());
        System.out.println("Simpanan      : Rp" + anggota1.getSimpanan());

        anggota1.setor(50000);
        System.out.println("Simpanan      : Rp" + anggota1.getSimpanan());
    }
}
