// Bu örnek ocp ihlal ediyor çünkü eğer başka bir kargo şirketi eklenirse,
// kod içerisinde değişiklik yapılması gerekecek ve bu da open closed prensibine aykırı olaak
public class KargoGonderimi {
    public int id;
    public String name;
    public String kargoSirketi;
    public double weight;

    public double ucretHesaplama() {
        if (kargoSirketi.equals("Aras Kargo"))
            return weight * 1.5;
        else if (kargoSirketi.equals("Yurtiçi Kargo"))
            return  weight * 2;
        else if (kargoSirketi.equals("ptt Kargo"))
            return weight* 2.5;
        else return weight;


    }

}


