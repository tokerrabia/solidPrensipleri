public class WhatsApp implements IsocialMedia {
    @Override
    public void chatWithFriend() {
        System.out.println("Mesajlaşmaya başla!");
    }

    @Override
    public void sendPhotosAndVideo() {
        System.out.println("Fotograf ve video gönderiminiz başarılı!");
    }
}
