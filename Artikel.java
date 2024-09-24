public class Artikel extends Konten {
    private String penulis;
    private String sumber;

    public Artikel(String idKonten, String jenisKonten, String sumber, String deskripsi, String penulis) {
        super(idKonten,jenisKonten, sumber, deskripsi);
        this.penulis = penulis;
        this.sumber = sumber;
    }

    public void tampilkanKonten() {
        System.out.println("ID Konten: " + this.idKonten);
        System.out.println("Jenis Konten: " + this.jenisKonten);
        System.out.println("Judul: " + this.judul);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Sumber: " + this.sumber);
    }
}