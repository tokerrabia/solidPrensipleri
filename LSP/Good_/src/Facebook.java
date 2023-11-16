public class Facebook implements ISocialPostManager, IsocialMedia {
    @Override
    public void chatWithFriend() {
        System.out.println("Mesajlaşmaya başla!");
    }

    @Override
    public void sendPhotosAndVideo() {
        System.out.println("Fotograf ve video gönderiminiz başarılı!");
    }

    @Override
    public void sendPost() {
        System.out.println("Post gönderimi başarılı!");
    }
}
