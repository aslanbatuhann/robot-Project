public class Serial implements Fixed {
    private String robotTipi1;
    private int kapasiteTasıma;
    private int tasimaHizi;

    public Serial() {

        this.kapasiteTasıma = 25;


        this.tasimaHizi = 10;

        this.robotTipi1 = "Seri Robot";

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
