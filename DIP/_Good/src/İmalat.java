public class İmalat {

    IGida gida;
    public İmalat(){
        gida= new Kek();
    }
    public void olustur(){
        gida.yap(true);
    }
}
