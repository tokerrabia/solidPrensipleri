import java.util.Scanner;
 // login için yeni bir class oluşturdum ve user classımı başka bir iş ile görevlendirmedim
public class LoginService {
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String name;
      String password;
      System.out.println("Lütfen adınızı giriniz.");
      name = scan.nextLine();
      System.out.println("Parolanızı giriniz");
      password = scan.nextLine();
      if (name.equals("Ali") && password.equals("şifrem")){
          System.out.println("Başarılı bir şekilde giriş yaptınız");
          } else {
          System.out.println("Adınız veya parolanız yanlış");
      }
  }

 }


