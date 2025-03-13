public class Giro extends Rekening{
    double limitPenarikan;

    public Giro(String np, String nr, double s, double lp) {
        super(np, nr, s);
        limitPenarikan = lp;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > limitPenarikan) {
            System.out.println("Penarikan melebihi limit penarikan!");
        } else {
            super.tarik(jumlah);
        }
    }
}