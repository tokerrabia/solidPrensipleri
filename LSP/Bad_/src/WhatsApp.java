public class WhatsApp implements ISocialMedia {
    @Override
    public void chatWithFriend() {

        System.out.println("Mesajlaşmaya başla!");
    }

    @Override
    public void sendPost() {

        // WhatsApptan post gönderimi yapılamaz lsp yi ihlal ediyor
    }

    @Override
    public void live() {

        // WhatsApptan canlı yayın yapılamaz lsp yi ihlal ediyor

    }

    @Override
    public void sendPhotoAndVideo() {

        System.out.println("Fotograf ve video gönderimi başarılı!");

    }
}
