public class PraktikumDemo {
    public static void main(String[] args) {
        System.out.println("=== Objek 1: Kendaraan (class umum/induk) ===");
        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.setMerk("Generic Vehicle");
        kendaraan1.tambahKecepatan(80);
        kendaraan1.printInfo();

        System.out.println("\n=== Objek 2: Mobil (turunan Kendaraan) ===");
        Mobil mobil1 = new Mobil();
        mobil1.setMerk("Toyota Avanza");
        mobil1.tambahKecepatan(100);
        mobil1.setJumlahPintu(4);
        mobil1.setJenisBahanBakar("Bensin");
        mobil1.printInfo();

        System.out.println("\n=== Objek 3: Motor (turunan Kendaraan) ===");
        Motor motor1 = new Motor();
        motor1.setMerk("Honda Vario");
        motor1.tambahKecepatan(60);
        motor1.setKapasitasMesin(125);
        motor1.setTipeMotor("Matic");
        motor1.printInfo();

        System.out.println("\n=== Objek 4: Handphone (berdiri sendiri) ===");
        Handphone hp1 = new Handphone();
        hp1.setMerk("Samsung Galaxy A54");
        hp1.isiDaya(45);
        hp1.printInfo();

        System.out.println("\n=== Objek 5: Tas Ransel (berdiri sendiri) ===");
        TasRansel tas1 = new TasRansel();
        tas1.setMerk("Eiger");
        tas1.tambahBarang(6);
        tas1.printInfo();
    }
}