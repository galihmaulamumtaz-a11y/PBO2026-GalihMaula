public class TasRansel {
    private String merk;
    private int jumlahBarang;
    private final int KAPASITAS_MAX = 10;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tambahBarang(int jumlah) {
        jumlahBarang += jumlah;
        if (jumlahBarang > KAPASITAS_MAX) {
            jumlahBarang = KAPASITAS_MAX;
        }
    }

    public void printInfo() {
        System.out.println("Merk          : " + merk);
        System.out.println("Jumlah Barang : " + jumlahBarang + "/" + KAPASITAS_MAX);
    }
}