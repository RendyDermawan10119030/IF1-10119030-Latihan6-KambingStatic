package if1.pkg10119030.latihan6.kambing.pkgstatic.konstanta;

/**
 * Nama     : Rendy Dermawan
 * Kelas    : IF-1
 * NIM      : 10119030
 * Deskripsi Program : Program ini dibuat untuk para Kambing
 */
public class Mamalia {
    //Variable jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;
}

public class KambingStatic {

// NAMA_KAMBING Sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak" +
                           + Mamalia.jumlahKambing);
}
}