import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama pemilik rekening : ");
        String namaPemilik = scanner.nextLine();
        System.out.println("Masukkan nomor rekening : ");
        String nomorRekening = scanner.nextLine();
        System.out.println("Masukkan saldo awal : ");
        double saldoAwal = scanner.nextDouble();
        Rekening rekening = new Rekening(namaPemilik, nomorRekening, saldoAwal);
    }

    
}
