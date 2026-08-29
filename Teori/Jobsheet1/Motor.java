public class Motor extends Kendaraan {
    private int kapasitasMesin;
    private String tipeMotor;

    public void setKapasitasMesin(int cc) {
        kapasitasMesin = cc;
    }

    public void setTipeMotor(String tipe) {
        tipeMotor = tipe;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + " cc");
        System.out.println("Tipe Motor      : " + tipeMotor);
        System.out.println("Jenis Kendaraan : Motor");
    }
}