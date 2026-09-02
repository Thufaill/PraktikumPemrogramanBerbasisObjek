package Jobsheet1.TugasPraktikum;

public class Demo {

        public static void main(String[] args) {

                Parfum parfum = new Parfum(
                                "bjorka",
                                "Desire Moment");

                Gunting gunting = new Gunting(
                                "Stainless Steel",
                                "Hitam");

                Pakaian pakaian = new Pakaian(
                                "Katun",
                                "L");

                Jersey jersey = new Jersey(
                                "Masuma",
                                "L",
                                "THUFAIL",
                                15);

                Kemeja kemeja = new Kemeja(
                                "Katun",
                                "L",
                                "Pendek",
                                6);

                System.out.println("====================================");
                System.out.println("            OBJEK PARFUM");
                System.out.println("====================================");

                parfum.semprot();
                parfum.isiUlang();
                parfum.cetakInfo();

                System.out.println();
                System.out.println("====================================");
                System.out.println("            OBJEK GUNTING");
                System.out.println("====================================");

                gunting.potong();
                gunting.asah();
                gunting.cetakInfo();

                System.out.println();
                System.out.println("====================================");
                System.out.println("            OBJEK PAKAIAN");
                System.out.println("====================================");

                pakaian.dipakai();
                pakaian.dicuci();
                pakaian.cetakInfo();

                System.out.println();
                System.out.println("====================================");
                System.out.println("            OBJEK JERSEY");
                System.out.println("====================================");

                jersey.cetakNomor();
                jersey.cetakNama();
                jersey.cetakInfo();

                System.out.println();
                System.out.println("====================================");
                System.out.println("            OBJEK KEMEJA");
                System.out.println("====================================");

                kemeja.kancingkan();
                kemeja.disetrika();
                kemeja.cetakInfo();
        }
}