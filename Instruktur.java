public class Instruktur {
    private String idInstruktur;
    private String nama;
    private String spesialisasi;
    private String email;

    public Instruktur(String idInstruktur, String nama, String spesialisasi, String email) {
        this.idInstruktur = idInstruktur;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.email = email;
    }
    
    public void tampilkanProfil() {
        System.out.println("ID Instruktur: " + idInstruktur);
        System.out.println("Nama: " + nama);
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Email: " + email);
    }

    public void buatKonten(Konten konten) {
        System.out.println(nama + " membuat konten baru.");
        konten.tampilkanKonten();
    }

    public static void main(String[] args) {
        Instruktur instruktur1 = new Instruktur("I001", "Ayu", "Pemrograman", "ayu@gmail.com");
        instruktur1.tampilkanProfil();

        Konten konten1 = new Konten("K001", "Video", "Belajar Java", "Tutorial dasar Java");
        instruktur1.buatKonten(konten1);
    }
}     
