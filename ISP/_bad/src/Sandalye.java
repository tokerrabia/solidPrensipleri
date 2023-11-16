// Bir arayüz kullanılırken sadece ihtiyaç duyulan methodlara erişim sağlanmalıdır.
// sandalye classında IMobilyadan implement ettiğimiz 3 methoda ihtiyaç duymuyoruz ve bu interface segregation prenswibine aykırı
public class Sandalye implements IMobilya{
    @Override
    public void ayak() {
        System.out.println("Sandalye 4 ayaklı olacak");
    }

    @Override
    public void cekmece() {

    }

    @Override
    public void kapak() {

    }

    @Override
    public void mentese() {

    }
}
