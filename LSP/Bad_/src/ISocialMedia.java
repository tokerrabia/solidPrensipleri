// alt sınıfların miras aldıkları üst sınıfların davranışlarını korumalı ve uygun şekilde,
//genişleyebilmelidir olmalıdır o yüzden bu kod lsp yi ihlal ediyor
public interface ISocialMedia {
    public abstract void chatWithFriend();
    public abstract void sendPost();
    public abstract void live();
    public abstract void sendPhotoAndVideo();

}
