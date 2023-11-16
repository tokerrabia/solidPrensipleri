public class Facebook implements ISocialMedia {
    @Override
    public void chatWithFriend() {

        System.out.println("Mesajlaşmaya başla!");
    }

    @Override
    public void sendPost() {

        System.out.println("Post gönderimi başarılı!");
    }

    @Override
    public void live() {
     // Facebookta canlı yayın yapılamaz lsp yi ihlal ediyor
    }

    @Override
    public void sendPhotoAndVideo() {

        System.out.println("Fotograf ve video paylaşımı başarılı!");

    }
}
