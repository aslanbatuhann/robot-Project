import javax.swing.*;
import java.util.Scanner;

public class Game {


    public void start() {
        int select;
        System.out.println("****************Projeye hoşgeldin****************");
        System.out.println();
        System.out.println("*******************OYUN BAŞLADI****************");
        System.out.println();

        System.out.println("Spider -->1");
        System.out.println("paletli -->2");
        System.out.println("tekerlekli -->3");
        System.out.println("seri -->4");
        System.out.println("paralel -->5");
        System.out.println("hibrit -->6");
        System.out.println("robot seciniz:");
        Scanner scan = new Scanner(System.in);
        form1 formGiris =new form1();
        formGiris.setVisible(true);


        select = scan.nextInt();

        while (select < 0 || select >= 6) {
            System.out.print("Please enter a valid input : ");
            select = scan.nextInt();
        }
        switch (select) {

            case 1:
                Spider s1 = new Spider();
                System.out.println(s1.getRobotTipi1() + " kullanmaya başla");
                System.out.println("hiz giriniz:");
                s1.setGezinmeHizi1(scan.nextInt());
                gezinmeKontrol(1,s1.getGezinmeHizi1());

                break;
            case 2:
                Pallet p1 = new Pallet();
                System.out.println(p1.getRobotTipi1() + " kullanmaya başla");
                System.out.println("hiz giriniz:");
                p1.setGezinmeHizi1(scan.nextInt());
                gezinmeKontrol(2,p1.getGezinmeHizi1());

                break;
            case 3:
                Wheeled w1 = new Wheeled();
                System.out.println(w1.getRobotTipi1() + " kullanmaya başla");
                System.out.println("hiz giriniz:");
                w1.setGezinmeHizi1(scan.nextInt());
                gezinmeKontrol(3,w1.getGezinmeHizi1());
                break;
            case 4:
                Serial seri1 = new Serial();
                System.out.println(seri1.getRobotTipi1() + " kullanmaya başla");
                System.out.println("yuk giriniz:");
                seri1.setKapasiteTasıma(scan.nextInt());
                yukKontrol(1,seri1.getKapasiteTasıma());
                System.out.println("taşıma hızı giriniz:");
                seri1.setTasimaHizi(scan.nextInt());
                tasimaKontrol(1,seri1.getTasimaHizi());
                break;
            case 5:
                Parallel para1 = new Parallel();
                System.out.println(para1.getRobotTipi1() + " kullanmaya başla");
                System.out.println("yuk giriniz:");
                para1.setKapasiteTasıma(scan.nextInt());
                yukKontrol(2,para1.getKapasiteTasıma());
                System.out.println("taşıma hızı giriniz:");
                para1.setTasimaHizi(scan.nextInt());
                tasimaKontrol(2,para1.getTasimaHizi());
                break;
            case 6:
                HybridRobot h1 = new HybridRobot();
                System.out.println(h1.getRobotTipi1() + " kullanmaya başla");
                break;
            default:
        }

    }

    public void gezinmeKontrol(int a,int hiz) {
        Spider s = new Spider();
        Pallet p = new Pallet();
        Wheeled w = new Wheeled();

        if(a==1){
            if(hiz >= p.getGezinmeHizi1()){
                System.out.println("spider robot hızı en düşüktür.");
            }
        }

        if(a==2){
            if(!(s.getGezinmeHizi1()<hiz && hiz< w.getGezinmeHizi1())){
                System.out.println("paletli robot hızı spider ve tekerlekli robot arasındadır.");
            }
        }

        if(a==3){
            if(hiz <= p.getGezinmeHizi1()){
                System.out.println("tekerlekli robot hızı en yüksektir.");
            }
        }
    }

    public void yukKontrol(int a,int yuk){
        Parallel para = new Parallel();
        Serial seri = new Serial();

        if(a==2){
            if(yuk >= para.getKapasiteTasıma()){
                System.out.println("paralel robot bunu taşıyamaz");
            }
        }

        if(a==1){
            if(yuk > seri.getKapasiteTasıma()){
                System.out.println("seri robot bunu taşıyamaz");
            }
        }
    }

    public void tasimaKontrol(int a,int hiz){
        Parallel para = new Parallel();
        Serial seri = new Serial();

        if(a==2){
            if(hiz >= para.getTasimaHizi()){
                System.out.println("paralel robotun taşıması hizda olamaz");
            }
        }

        if(a==1){
            if(hiz > seri.getTasimaHizi()){
                System.out.println("seri robotun taşıması hizda olamaz");
            }
        }
    }

}
