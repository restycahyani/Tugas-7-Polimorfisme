package Perusahaan;

public class Main {
    public static void main(String[] args) {

        Pegawai pegawaiTetap1 = new PegawaiTetap("Resty", "3507205923478", 4000000);
        Pegawai pegawaiTetap2 = new PegawaiTetap("Dian", "35740923828434", 3500000);
        Pegawai pegawaiTetap3 = new PegawaiTetap("Fikri", "30583247932874", 3000000);

        Pegawai pegawaiHarian1 = new PegawaiHarian("Reza", "35542738974232", 10000, 40);
        Pegawai pegawaiHarian2 = new PegawaiHarian("Lia", "351436284632243", 9000, 35);
        Pegawai pegawaiHarian3 = new PegawaiHarian("Rangga", "35682347324423", 8000, 50);

        Pegawai sales1 = new Sales("Hendra", "35136157255283", 100, 70000);
        Pegawai sales2 = new Sales("Wita", "345329792632", 80, 60000);
        Pegawai sales3 = new Sales("Iza", "3897823892783", 60, 50000);

        System.out.println(pegawaiTetap1);
        System.out.println(pegawaiTetap2);
        System.out.println(pegawaiTetap3);

        System.out.println(pegawaiHarian1);
        System.out.println(pegawaiHarian2);
        System.out.println(pegawaiHarian3);

        System.out.println(sales1);
        System.out.println(sales2);
        System.out.println(sales3);

    }
}