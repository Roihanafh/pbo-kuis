import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("Selamat Datang di Aplikasi Kursus Online!");
        System.out.println("===========================================");
        System.out.println();

        //menambahkan beberapa kursus
        Kursus javascript = new Kursus("JS001", "Javascript Fundamental", "Javascript Fundamental", 3, 100000);
        Kursus java = new Kursus("J001", "Java Fundamental", "Java Fundamental", 3, 100000);

        //polimorfisme terdapat pada konten yang menjadi 3 bentuk berbeda(Video, Kuis, Artikel)
        //membuat objek video, kuis, artikel dan memasukkan pada kursus java
        Kuis kuis = new Kuis("K001", "Kuis", "Kuis java", "Kuis minggu 4", 10, 120);
        Video video = new Video("V001", "Video", "Video java", "Video penjelasan", 10, "720p");
        Artikel artikel = new Artikel("A001", "Artikel","Menjelaskan seputar class dan object pada pemrograman java", "Class dan Object", "Ayu","Jurnal pendidikan");
        java.tambahArtikel(artikel);
        java.tambahVideo(video);
        java.tambahKuis(kuis);

        //membuat objek instruktur dan memasukkan pada kursus java
        Instruktur instruktur = new Instruktur("I001", "Ayu", "Pemrograman", "ayu@gmail.com");
        java.tambahkanInstruktur(instruktur);

        //membuat objek peserta dan memasukkan pada kursus java
        Peserta peserta = new Peserta( "Alfin", "Alfin1234@example.com", "085123456789");
        Peserta peserta2 = new Peserta( "Budi", "Budi1234@example.com", "085123418299");
        Peserta peserta3 = new Peserta( "Asta", "Asta1234@example.com", "091280128012");
        java.tambahPeserta(peserta);
        java.tambahPeserta(peserta2);
        System.out.println("---saat kelas sudah penuh---");
        java.tambahPeserta(peserta3);//kondisi penambahan saat kelas sudah penuh

        //menampilkan detail kursus java yang telah diisi dengan konten dan peserta, serta kursus javascript yang masih kosong
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Kursus yang memiliki value(peserta dan konten sudah diisikan)");
        java.tampilkanDetailKursus();
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Kursus yang kosong(peserta dan konten belum dimasukkan)");
        javascript.tampilkanDetailKursus();

        //mencoba mengubah value dari durasi pada kursus javascript menggunakan method set get
        System.out.println("=========================================");
        System.out.println("Ubah durasi pada kursus javascript");
        System.out.println("=========================================");
        System.out.println("Durasi kursusjavascript sebelum diubah: " + javascript.getDurasi());
        javascript.setDurasi(5);
        System.out.println("Durasi kursus javascript setelah diubah: " + javascript.getDurasi());
        System.out.println("=========================================");

        //peserta 1 mendaftar pada kursus java
        peserta.daftarKursus(java);
        
        //peserta 1 melakukan pembayaran untuk kursus java
        System.out.println("=========================================");
        System.out.println("Pembayaran");
        System.out.println("=========================================");
        Date tglPembayaran = new Date();
        Pembayaran pembayaran = new Pembayaran("P001", "Transfer", tglPembayaran, java);
        peserta.bayarKursus(pembayaran);
        System.out.println("=========================================");
        System.out.println("Challange 1");
        System.out.println("=========================================");
        System.out.print("Id peserta 1: "+peserta.getIdPeserta()+"\n");
        System.out.print("Id peserta 2: "+peserta2.getIdPeserta()+"\n");
        System.out.println("=========================================");
        System.out.println("Challange 2");
        System.out.println("=========================================");
        //Menambahkan maks peserta
        java.setJumlahPeserta(5);
        System.out.println("Maksimal peserta: "+java.getJumlahPeserta());
        //menambahkan peserta 3 ke dalam kelas java
        Peserta peserta4 = new Peserta( "Caca", "Caca1234@example.com", "091280128012");
        java.tambahPeserta(peserta4);
        java.tampilkanPeserta();
        
        
    }
}
