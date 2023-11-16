public class Ünite implements IAyak,IÇekmece,IMenteşe,IKapak{
    @Override
    public void ayak() {
        System.out.println("Ünite 6 ayaklı olacak");
    }

    @Override
    public void kapak() {
        System.out.println("Ünite 2 kapaklı olacak");
    }

    @Override
    public void mentese() {
        System.out.println("Ünite 4 menteşeli olacak");
    }

    @Override
    public void cekmece() {
        System.out.println("Ünite 2 çekmeceli olacak");
    }
}
