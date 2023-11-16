public class Sandalye implements IAyak{
    // Tüm metodları kapsayan tek bir interface kullanmak yerine,
    // herbiri ayrı metodlar içeren birkaç interface oluşturdum ve gereksiz bağımlılıkları önledim
    @Override
    public void ayak() {
        System.out.println("Sandalye 4 ayaklı olacak");
    }
}
