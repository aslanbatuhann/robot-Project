public abstract class Robot {

    private int motorSayisi;
    private int yukMiktari;
    private String robotTipi;

    public Robot(int motorSayisi, int yukMiktari, String robotTipi) {
        this.motorSayisi = motorSayisi;
        this.yukMiktari = yukMiktari;
        this.robotTipi = robotTipi;
    }

    public String getRobotTipi() {
        return robotTipi;
    }

    public int getMotorSayisi() {
        return motorSayisi;
    }

    public void setMotorSayisi(int motorSayisi) {
        this.motorSayisi = motorSayisi;
    }

    public int getYukMiktari() {
        return yukMiktari;
    }

    public void setYukMiktari(int yukMiktari) {
        this.yukMiktari = yukMiktari;
    }
}
