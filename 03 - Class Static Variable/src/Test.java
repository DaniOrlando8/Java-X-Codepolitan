public class Test {
    static String pesan = "Selamat Belajar!";

    public static void main(String[] args) throws Exception {
        System.out.println(Test.pesan);
    }
}
/**
 * Class/Static Variable
Class variable atau dikenal juga dengan istilah static variable adalah variable yang dideklarasikan di dalam class
di luar method. Sama seperti instance variable, class variable dibuat bila kita membutuhkan variabel yang digunakan
di banyak method.

Perbedaan class variable dengan instance variable adalah, pada class variable kita menambahkan kata kunci static 
pada pendeklarasian.

static String pesan;
Class variable dapat dipanggil langsung di dalam class di dalam method, dan pada method static dapat dipanggil 
dengan menulis NamaClass.namaVariabel.

Praktek
Pada editor terdapat class Test dengan satu class variable. Jalankan kode dan lihat outputnya.
Karena variabel pesan adalah class variable atau static variable, kita dapat memanggil langsung di dalam method 
main() tanpa harus membuat objeknya dahulu. Hapus deklarasi objek Test() di baris ke-5, dan ganti pemanggilan
variabel di baris ke-6 menjadi Test.pesan. Jalankan kode dan lihat hasilnya.
 */