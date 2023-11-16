public class User {
    private int id;
    private String name;
    private String lastname;

    public User(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void login(String username){
        // Login işlemlerinin bu class içerisinde bulunması srp ihlal ediyor
        if (lastname.isEmpty()){
            System.out.println("İsim alanı boş bırakılamaz");
        } else {
            System.out.println("Başarıyla giriş yaptınız");
        }
    }
}


