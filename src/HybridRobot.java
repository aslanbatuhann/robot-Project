import java.lang.management.ThreadInfo;

public class HybridRobot implements Active, Fixed {

    private int sabitlemeSuresi;
    private int gecisSuresi;
    private String robotTipi1;

    private int kapasiteTasıma;
    private int gezinmeHizi1;

    public HybridRobot() {
        this.sabitlemeSuresi = sabitlemeSuresi;
        this.gecisSuresi = gecisSuresi;
        this.robotTipi1 = "Hibrit Robot";
        this.kapasiteTasıma = 6;
        this.gezinmeHizi1 = 7;


    }

    public int getKapasiteTasıma() {
        return kapasiteTasıma;
    }

    public void setKapasiteTasıma(int kapasiteTasıma) {
        this.kapasiteTasıma = kapasiteTasıma;
    }

    public int getGezinmeHizi1() {
        return gezinmeHizi1;
    }

    public void setGezinmeHizi1(int gezinmeHizi1) {
        this.gezinmeHizi1 = gezinmeHizi1;
    }

    public int getSabitlemeSuresi() {
        return sabitlemeSuresi;
    }

    public void setSabitlemeSuresi(int sabitlemeSuresi) {
        this.sabitlemeSuresi = sabitlemeSuresi;
    }

    public int getGecisSuresi() {
        return gecisSuresi;
    }

    public void setGecisSuresi(int gecisSuresi) {
        this.gecisSuresi = gecisSuresi;
    }

    public String getRobotTipi1() {
        return robotTipi1;
    }

    @Override
    public boolean engelGec() {
        return true;
    }
}
