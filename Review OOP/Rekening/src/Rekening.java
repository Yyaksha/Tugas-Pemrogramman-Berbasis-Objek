public class Rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;

    public Rekening(String np, String nr, double s) {
        namaPemilik = np;
        nomorRekening = nr;
        this.saldo = s;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }
    public void tarik(double jumlah) {
        saldo -= jumlah;
    }

    public void tampilkanInfo(){
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Saldo : " + saldo);
    }
}