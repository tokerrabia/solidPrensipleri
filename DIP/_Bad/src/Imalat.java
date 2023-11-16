// buradaki oluştur methodu kek sınıfı içerisindeki kekYap methoduna bağımlı bu da dip ihlal ediyor
//
public class Imalat {
    public void olustur(){
        Kek kek = new Kek();
        kek.kekYap(true);
    }
}
