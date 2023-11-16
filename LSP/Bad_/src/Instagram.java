public class Instagram implements ISocialMedia {
    @Override
    public void chatWithFriend() {

        System.out.println("Mesajlaşmaya başla!");

    }

    @Override
    public void sendPost() {

        System.out.println("Post paylaşımı başarılı!");

    }

    @Override
    public void live() {

        System.out.println("Canlı yayın başlattınız!");

    }

    @Override
    public void sendPhotoAndVideo() {

        System.out.println("Fotograf ve video gönderimi başarılı!");

    }
}
