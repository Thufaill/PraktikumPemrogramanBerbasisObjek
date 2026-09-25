package Jobsheet3.TugasPraktikum;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nomor Resi: ");
        String resi = scanner.nextLine();
        System.out.print("Masukkan Nama Pemilik: ");
        String pemilik = scanner.nextLine();
        System.out.print("Masukkan Kapasitas Maksimal (kg): ");
        double kapasitas = scanner.nextDouble();

        Kontainer k1 = new Kontainer(resi, pemilik, kapasitas);

        System.out.println("\n--- SIMULASI TAMBAH MUATAN ---");
        System.out.print("Masukkan berat muatan yang ingin ditambahkan (kg): ");
        double muatanMasuk = scanner.nextDouble();
        k1.tambahMuatan(muatanMasuk);

        System.out.println("\n--- SIMULASI BONGKAR MUATAN ---");
        System.out.print("Masukkan berat muatan yang ingin diturunkan (kg): ");
        double muatanKeluar = scanner.nextDouble();
        k1.turunkanMuatan(muatanKeluar);

        scanner.close();
    }
}