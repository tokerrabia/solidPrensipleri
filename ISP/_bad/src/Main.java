public class Main {
    public static void main(String[] args){
        Dolap dolap = new Dolap();
        dolap.cekmece();
        dolap.kapak();
        dolap.mentese();
        dolap.ayak();


        System.out.println("----------------------");

        Ünite unite = new Ünite();
        unite.cekmece();
        unite.kapak();
        unite.mentese();
        dolap.ayak();

        System.out.println("----------------------");

        Sandalye sandalye = new Sandalye();
        sandalye.ayak();


    }

}