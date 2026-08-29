public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public void setJumlahPintu(int jumlah) {
        jumlahPintu = jumlah;
    }

    public void setJenisBahanBakar(String jenis) {
        jenisBahanBakar = jenis;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Pintu    : " + jumlahPintu);
        System.out.println("Jenis BBM       : " + jenisBahanBakar);
        System.out.println("Jenis Kendaraan : Mobil");
    }
}