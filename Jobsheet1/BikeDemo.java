package Jobsheet1;

public class BikeDemo {

    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        Bike mountainBike3 = new Bike(); // Tambahan Percobaan 1
        Bike mountainBike4 = new Bike(); // Tambahan Percobaan 1
        RoadBike roadBike1 = new RoadBike(); // Percobaan 2
        RoadBike roadBike2 = new RoadBike(); // Tambahan Percobaan 2

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        mountainBike3.setBrand("Vir"); // Tambahan Percobaan 1
        mountainBike3.speedAcceleration(10); // Tambahan Percobaan 1
        mountainBike3.gearChanges(7); // Tambahan Percobaan 1
        mountainBike3.printInfo(); // Tambahan Percobaan 1

        mountainBike4.setBrand("Bin"); // Tambahan Percobaan 1
        mountainBike4.gearChanges(6); // Tambahan Percobaan 1
        mountainBike4.speedAcceleration(60); // Tambahan Percobaan 1
        mountainBike4.printInfo(); // Tambahan Percobaan 1

        roadBike1.setBrand("Specialized"); // Percobaan 2
        roadBike1.setTireWidth(25); // Percobaan 2
        roadBike1.speedAcceleration(15); // Percobaan 2
        roadBike1.gearChanges(4); // Percobaan 2
        roadBike1.printInfo(); // Percobaan 2

        roadBike2.setBrand("Fail"); // Tambahan Percobaan 2
        roadBike2.setTireWidth(30); // Tambahan Percobaan 2
        roadBike2.gearChanges(4); // Tambahan Percobaan 2
        roadBike2.speedAcceleration(25); // Tambahan Percobaan 2
        roadBike2.printInfo(); // Tambahan Percobaan 2
    }
}