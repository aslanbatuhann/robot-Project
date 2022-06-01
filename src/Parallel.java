public class Parallel implements Fixed {
    private String robotTipi1;
    private int kapasiteTasıma;
    private int tasimaHizi;

    public Parallel() {
        this.kapasiteTasıma = 50;


        this.tasimaHizi =30;

        this.robotTipi1 = "Paralel Robot";

    }

    public int getTasimaHizi() {
        return tasimaHizi;
    }

    public void setTasimaHizi(int tasimaHizi) {
        this.tasimaHizi = tasimaHizi;
    }

    public int getKapasiteTasıma() {
        return kapasiteTasıma;
    }

    public void setKapasiteTasıma(int kapasiteTasıma) {
        this.kapasiteTasıma = kapasiteTasıma;
    }

    public String getRobotTipi1() {
        return robotTipi1;
    }
}
