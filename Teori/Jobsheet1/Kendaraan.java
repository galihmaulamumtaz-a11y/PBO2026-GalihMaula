public class Kendaraan {
    private String merk;
    private int kecepatan;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tambahKecepatan(int tambahan) {
        kecepatan += tambahan;
        if (kecepatan > 200) {
            kecepatan = 200;
        }
    }

    public void printInfo() {
        System.out.println("Merk      : " + merk);
        System.out.println("Kecepatan : " + kecepatan + " km/h");
    }
}