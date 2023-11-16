// yeni bir kargo şirketi eklemek istediğim durumda kodda bir değişiklik yapmayacağım,
// ve mesela ups kargo şirketi ekleneceği durumda yeni bir class ile bu classa extend edip,
// kodumu genişlemeye açık fakar değiştirmeye kapalı yazmış olacağım
public abstract class KargoGonderimi {
    public int id;
    public String name;
    public  double weight = 15;

    public abstract double ucretHesaplama();

}
