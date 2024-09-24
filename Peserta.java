class Peserta {
    protected String idPeserta;
    protected String nama;
    protected String email;
    protected String nomorTelepon;
    protected Status status;


    // Constructor untuk Peserta
    public Peserta(String idPeserta, String nama, String email, String nomorTelepon) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.email = email;
        this.nomorTelepon = nomorTelepon;
    }

    // Method untuk membayar kursus
    public void bayarKursus(Pembayaran pembayaran) {
        System.out.println(nama + " telah melakukan pembayaran.");
        pembayaran.tampilkanDataPembayaran();  // Menampilkan detail pembayaran
    }

    // Getters untuk semua atribut
    public String getIdPeserta() {
        return idPeserta;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
