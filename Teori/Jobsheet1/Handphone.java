public class Handphone {
    private String merk;
    private int levelBaterai;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void isiDaya(int persen) {
        levelBaterai += persen;
        if (levelBaterai > 100) {
            levelBaterai = 100;
        }
    }

    public void printInfo() {
        System.out.println("Merk          : " + merk);
        System.out.println("Level Baterai : " + levelBaterai + "%");
    }
}