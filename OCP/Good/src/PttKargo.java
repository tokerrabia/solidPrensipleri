public class PttKargo extends KargoGonderimi{

    @Override
    public double ucretHesaplama() {
        return weight* 2.5;

    }
}
