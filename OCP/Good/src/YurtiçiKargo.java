public class YurtiçiKargo extends KargoGonderimi{
    @Override
    public double ucretHesaplama() {
        return weight* 2.0;
    }
}
