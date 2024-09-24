public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("Selamat Datang di Aplikasi Kursus Online!");
        System.out.println("===========================================");
        //menambahkan beberapa kursus
        Kursus javascript = new Kursus("JS001", "Javascript Fundamental", "Javascript Fundamental", 3, 100000);
        Kursus java = new Kursus("J001", "Java Fundamental", "Java Fundamental", 3, 100000);
        //menambahkan beberapa konten pada kursus java
        Konten konten1 = new Konten("K001", "Kelas", "Belajar Java", "Tutorial dasar Java");
        Konten konten2 = new Konten("K002", "Kelas", "Belajar Fungsi pada Java", "Tutorial dasar Java");
        Konten konten3 = new Konten("K003", "Kelas", "Belajar Array pada Java", "Tutorial dasar Java");  
        //memasukkan data pada kelas kursus java 
        java.tambahKonten(konten1);
        java.tambahKonten(konten2); 
        java.tambahKonten(konten3); 
        //membuat objek peserta dan memasukkan pada kursus java
        Peserta peserta = new Peserta("P001", "Alfin", "Alfin1234@example.com", "085123456789");
        Peserta peserta2 = new Peserta("P002", "Budi", "Budi1234@example.com", "085123418299");
        Peserta peserta3 = new Peserta("P003", "Asta", "Asta1234@example.com", "091280128012");
        java.tambahPeserta(peserta);
        java.tambahPeserta(peserta2);
        java.tambahPeserta(peserta3);
        //menampilkan detail kursus java yang telah diisi dengan konten dan peserta, serta kursus javascript yang masih kosong
        java.tampilkanDetailKursus();
        javascript.tampilkanDetailKursus();

    }
}
