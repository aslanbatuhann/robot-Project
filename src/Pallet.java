public class Pallet implements Active {
    private int paletSayisi;
    private String robotTipi1;
    private int gezinmeHizi1;

    public Pallet() {
        this.paletSayisi = paletSayisi;
        this.gezinmeHizi1 = 15;

        this.robotTipi1 = "Paletli Robot";

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

    public int getPaletSayisi() {
        return paletSayisi;

    }

    public void setPaletSayisi(int paletSayisi) {
        this.paletSayisi = paletSayisi;
    }

    public void hiz() {
        System.out.println(gezinmeHizi1);
    }

    @Override
    public boolean engelGec() {
        return true;
    }

    public void EngelGecmeSuresiBul() {
        int engelGecmeSuresi;
        engelGecmeSuresi = (Active.motorSayisi * 3);
        System.out.println(engelGecmeSuresi);
    }
}
