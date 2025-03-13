public class Tabungan extends Rekening{
    double bungaTahunan;
    double bunga;

    public Tabungan(String np, String nr, double s, double b) {    
        super(np, nr, s);
        bungaTahunan = b;
    }
    
    public void hitungBunga(int bulan) {
        bunga = (bungaTahunan / 12) * saldo * bulan;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan : " + bungaTahunan);
        System.out.println("Bunga : " + bunga);
    }
}