import java.util.Date;

public class Pembayaran {
    private String idPembayaran;
    private String metodePembayaran;
    private double jumlah;
    private Date tglPembayaran;

public Pembayaran(String idPembayaran, String metodePembayaran, double jumlah, Date tglPembayaran){
    this.idPembayaran = idPembayaran;
    this.metodePembayaran = metodePembayaran;
    this.jumlah = jumlah;
    this.tglPembayaran = tglPembayaran;
}

public void tampilkanDataPembayaran(){
    System.out.println("===================================");
    System.out.println("DETAIL PEMBAYARAN");
    System.out.println("===================================");
    System.out.println("ID Pembayaran: " + idPembayaran);
    System.out.println("Metode Pembayaran: " + metodePembayaran);
    System.out.println("Jumlah: " + jumlah);
    System.out.println("Tanggal Pembayaran: " + tglPembayaran);
}
}