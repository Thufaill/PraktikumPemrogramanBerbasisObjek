package Jobsheet2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "101";
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        // Jawaban Soal No. 12
        System.out.println("\n------------------------------");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "254107020019";
        mhs2.nama = "Javier";
        mhs2.alamat = "Jl. Akordion Utara No.A3";
        mhs2.kelas = "2D";
        mhs2.tampilBiodata();

        System.out.println("\n------------------------------");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "254107020020";
        mhs3.nama = "Thufail";
        mhs3.alamat = "Jl. Lumba-Lumba";
        mhs3.kelas = "1G";
        mhs3.tampilBiodata();
    }
}