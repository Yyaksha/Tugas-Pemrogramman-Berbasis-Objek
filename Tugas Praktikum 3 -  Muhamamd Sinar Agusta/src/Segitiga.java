public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sudut;
    private double sisiA;
    private double sisiB;
    private double sisiC;
    private char tipe;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.tipe = 'S';
    }

    // Konstruktor untuk segitiga dengan 3 sisi (Heron’s Formula)
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisiA = sisi1;
        this.sisiB = sisi2;
        this.sisiC = sisi3;
        this.tipe = 'H';
    }

    // Konstruktor untuk segitiga dengan 2 sisi & sudut
    public Segitiga(double sisi1, double sisi2, double sudut, boolean pakaiSudut) {
        this.sisiA = sisi1;
        this.sisiB = sisi2;
        this.sudut = sudut;
        this.tipe = 'A';
    }

    @Override
    public double hitungLuas() {
        switch (tipe) {
            case 'S':
                return (alas * tinggi) / 2;
            case 'H':
                double s = (sisiA + sisiB + sisiC) / 2;
                return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
            case 'A':
                return 0.5 * sisiA * sisiB * Math.sin(Math.toRadians(sudut));
            default:
                return 0;
        }
    }

    @Override
    public double hitungKeliling() {
        switch (tipe) {
            case 'S':
                return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
            case 'H':
                return sisiA + sisiB + sisiC;
            case 'A':
                return sisiA + sisiB + Math
                        .sqrt(sisiA * sisiA + sisiB * sisiB - 2 * sisiA * sisiB * Math.cos(Math.toRadians(sudut)));
            default:
                return 0;
        }
    }

    public String jenisSegitiga() {
        if (tipe == 'H') {
            if (sisiA == sisiB && sisiB == sisiC)
                return "Segitiga Sama Sisi";
            else if (sisiA == sisiB || sisiB == sisiC || sisiA == sisiC)
                return "Segitiga Sama Kaki";
            else
                return "Segitiga Sembarang";
        }
        return "Segitiga tidak dapat dikategorikan berdasarkan sisi";
    }
}
