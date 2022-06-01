public class Spider implements Active {
    private int bacakSayisi;
   private String robotTipi1 ;
   private int gezinmeHizi1;



    public Spider() {
        this.bacakSayisi = bacakSayisi;
        this.gezinmeHizi1 = 5;


        this.robotTipi1 = "bacaklı robot";


    }
    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
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

    @Override
    public boolean engelGec() {
        System.out.println("bacaklı robotlar engelden geçemez");
        return false;
    }
}
