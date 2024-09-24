import java.util.Date;

class Status extends Peserta {
    private Date tanggalMulai;
    private Date tanggalSelesai;
    private String status;

    // Constructor untuk Status, yang merupakan subclass dari Peserta
    public Status(String idPeserta, String nama, String email, String nomorTelepon, Date tanggalMulai, Date tanggalSelesai, String status) {
        super(idPeserta, nama, email, nomorTelepon);  // Memanggil constructor dari Peserta
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.status = status;
    }

    // Method untuk mengupdate status
    public void updateStatus(String statusBaru) {
        this.status = statusBaru;
        System.out.println("Status telah diupdate menjadi: " + status);
    }

    // Method untuk menampilkan status
    public void tampilStatus() {
        System.out.println("Peserta: " + nama);
        System.out.println("Tanggal Mulai: " + tanggalMulai);
        System.out.println("Tanggal Selesai: " + (tanggalSelesai != null ? tanggalSelesai : "Belum Selesai"));
        System.out.println("Status saat ini: " + status);
    }
}
