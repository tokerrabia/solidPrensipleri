// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User(56895, "Ali", "Yılmaz");

        System.out.println("ÇIKTILARIMIZ: ");
        System.out.println("--------------");
        System.out.println("Kullanıcının ıd bilgisi: " + user.getId());
        System.out.println("Kullanıcının adı: " + user.getName());
        System.out.println("Kullanıcının soyadı: " + user.getLastname());
    }
}