public class Dolap implements IAyak, IKapak, IMenteşe, IÇekmece {
    @Override
    public void ayak() {
        System.out.println("Dolap 8 ayaklı olacak");
    }

    @Override
    public void kapak() {
        System.out.println("Dolap 4 kapaklı olacak");
    }

    @Override
    public void mentese() {
        System.out.println("Dolap 6 menteşeli olacak");
    }

    @Override
    public void cekmece() {
        System.out.println("Dolap 2 çekmeceli olacak");
    }
}
