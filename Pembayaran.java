import java.util.Date;

public class Pembayaran {
    private String idPembayaran;
    private String metodePembayaran;
    private double jumlah;
    private Date tglPembayaran;
    private Kursus kursus;

public Pembayaran(String idPembayaran, String metodePembayaran, double jumlah, Date tglPembayaran, Kursus kursus) {
    this.idPembayaran = idPembayaran;
    this.metodePembayaran = metodePembayaran;
    this.jumlah = jumlah;
    this.tglPembayaran = tglPembayaran;
    this.kursus = kursus;
}

public void tampilkanDataPembayaran(){
    System.out.println("===================================");
    System.out.println("DETAIL PEMBAYARAN");
    System.out.println("===================================");
    System.out.println("ID Pembayaran: " + idPembayaran);
    System.out.println("Pembayaran kursus: " + kursus.getNama());
    System.out.println("Metode Pembayaran: " + metodePembayaran);
    System.out.println("Jumlah: " + jumlah);
    System.out.println("Tanggal Pembayaran: " + tglPembayaran);
}
}