
public class Konten{
    protected String idKonten;
    protected String jenisKonten;
    protected String judul;
    protected String deskripsi;
    protected Instruktur instruktur[] = new Instruktur[5];

    public Konten(){
        
    }
    public Konten(String idKonten, String jenisKonten, String judul, String deskripsi){
        this.idKonten = idKonten;
        this.jenisKonten =jenisKonten;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public void tampilkanKonten(){
        System.out.println("ID Konten: " + idKonten);
        System.out.println("Jenis Konten: " + jenisKonten);
        System.out.println("Judul: " + judul);
        System.out.println("Deskripsi: " + deskripsi);
    }

    public void tambahkanInstruktur(Instruktur instruktur){
        for (int index = 0; index == this.instruktur.length; index++) {
            if (this.instruktur[index]!=null) {
                if (this.instruktur.length==index) {
                    System.out.println("Maaf jumlah instruktur sudah pada batas maksimal!");
                }else{
                    continue;
                }
            }else{
                this.instruktur[index] = instruktur;
                System.out.println("instruktur berhasil dimasukkan");
                break;
            }
        }
    }
    public String getJudul(){
        return judul;
    }
}