public class Wheeled implements Active {
    private int tekerlekSayisi;
    private String robotTipi1;

    private int gezinmeHizi1;


    public Wheeled() {
        this.tekerlekSayisi = tekerlekSayisi;
        int gezinmeHizi1 = 20;

        this.robotTipi1 ="Tekerlekli Robot";

    }

    public int getGezinmeHizi1() {
        return gezinmeHizi1;
    }

    public void setGezinmeHizi1(int gezinmeHizi1) {
        this.gezinmeHizi1 = gezinmeHizi1;
    }

    public String getRobotTipi1() {
        return robotTipi1;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    @Override
    public boolean engelGec() {
        return true;
    }

    public void EngelGecmeSuresiBul() {
        double engelGecmeSuresi;
        engelGecmeSuresi = (Active.motorSayisi * 0.5);
        System.out.println(engelGecmeSuresi);
    }

}
