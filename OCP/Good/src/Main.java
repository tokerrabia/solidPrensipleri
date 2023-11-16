import java.awt.*;

public class Main {
    public static void main(String[] args){
        KargoGonderimi kargoGonderimi1 = new YurtiçiKargo();
        KargoGonderimi kargoGonderimi2 = new ArasKargo();
        KargoGonderimi kargoGonderimi3 = new PttKargo();


        System.out.println("Ödeyeceğiniz tutar: " + kargoGonderimi3.ucretHesaplama() + " tl");
        System.out.println("Ödeyeceğiniz tutar: " + kargoGonderimi2.ucretHesaplama() + " tl");
        System.out.println("Ödeyeceğiniz tutar: " + kargoGonderimi1.ucretHesaplama() + " tl");


    }

    }
