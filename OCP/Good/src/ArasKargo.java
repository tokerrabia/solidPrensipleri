public class ArasKargo extends KargoGonderimi{
    @Override
    public double ucretHesaplama() {
        return weight * 1.5;
    }
}
