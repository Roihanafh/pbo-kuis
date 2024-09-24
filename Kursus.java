public class Kursus {
    private String idKursus;
    private String namaKursus;
    private String deskripsi;
    private int durasi;
    private int harga;
    private Konten konten[] = new Konten[5];
    private Peserta peserta [] = new Peserta[2];

    public Kursus(String idKursus, String namaKursus, String deskripsi, int durasi, int harga) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
        this.harga = harga;
    }

    public void tampilkanDetailKursus() {
        System.out.println("===================================");
        System.out.println("Detail Kursus");
        System.out.println("===================================");
        System.out.println("ID Kursus: " + this.idKursus);
        System.out.println("Nama Kursus: " + this.namaKursus);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Durasi: " + this.durasi);
        System.out.println("Harga: " + this.harga);
        System.out.println("-----------------------------------");
        System.out.println("Konten");
        System.out.println("-----------------------------------");
        for (int index = 0; index < this.konten.length; index++) {
            if (konten[0]==null) {
                System.out.println("Belum ada konten yang terdaftar pada kursus ini");
                break;
            }else if (konten[index]!=null) {
                System.out.println(index+1+ " " + konten[index].getJudul());
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Peserta");
        System.out.println("-----------------------------------");
        for (int index = 0; index < this.peserta.length; index++) {
            if (peserta[0]==null) {
                System.out.println("Belum ada peserta yang mendaftar pada kursus ini");
                break;
            }else if (peserta[index]!=null) {
                System.out.println(index+1+ " " + peserta[index].getNama());
            }
        }
        System.out.println("===================================");
    }

    public void tambahKonten(Konten konten) {
        for (int index = 0; index < this.konten.length; index++) {
            if (this.konten[index]!=null) {
                if (this.konten.length-1==index) {
                    System.out.println("Maaf jumlah konten sudah pada batas maksimal!");
                }else{
                    continue;
                }
            }else{
                this.konten[index] = konten;
                System.out.println("Konten berhasil dimasukkan");
                break;
            }
        }
    }

    public void tambahPeserta(Peserta peserta){
        for (int index = 0; index < this.peserta.length; index++) {
            if (this.peserta[index]!=null) {
                if (this.peserta.length-1==index) {
                    System.out.println("Maaf jumlah peserta sudah pada batas maksimal!");
                }else{
                    continue;
                }
            }else{
                this.peserta[index] = peserta;
                System.out.println("peserta berhasil dimasukkan");
                break;
            }
        }
    }
}