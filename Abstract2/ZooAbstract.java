public class ZooAbstract{
    static void test(Binatang a){
        a.makan();
        a.tidur();
        a.mati();
    }
    public static void main(String[] a){
        Harimau macan = new Harimau();
        Bebek donald = new Bebek();
        test(macan);
        test(donald);
    }
}