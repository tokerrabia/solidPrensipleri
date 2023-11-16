public class Instagram implements IsocialMedia, ILiveManager, ISocialPostManager {

    @Override
    public void chatWithFriend() {
        System.out.println("Mesajlaşmaya başla!");
    }

    @Override
    public void sendPhotosAndVideo() {
        System.out.println("Fotograf ve video gönderimi başarılı!");
    }

    @Override
    public void sendPost() {
        System.out.println("Post gönderimi başarılı!");
    }

    @Override
    public void live() {
        System.out.println("Canlı yayın başlattınız!");
    }
}
