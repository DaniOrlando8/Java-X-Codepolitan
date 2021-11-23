public class Main {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Belajar";

        System.out.println(pesan);
    }
}
/**
 * Variabel di Java
Variabel adalah wadah yang diberi nama yang dapat kita isi dengan nilai dan dapat dimanipulasi. Sebelum dapat 
digunakan, variabel harus dideklarasikan terlebih dahulu.

tipedata namavariabel = nilai;
Bila hendak mendeklarasikan lebih dari satu variabel yang bertipe sama, pisahkan dengan tanda koma.

int a, b, c;
int a = 10, b = 10;
byte B = 22;
double pi = 3.14159;
char a = 'a';
Ada tiga jenis variabel di Java:

Variabel lokal
Variabel instance
Variabel Class/Static
Variabel lokal adalah variabel yang dideklarasikan di dalam method atau blok. Variabel ini hanya dapat digunakan 
di dalam method tersebut. Variabel ini dibuat ketika method dipanggil, dan akan langsung dihapus setelah 
pemanggilan method selesai.

Pada pendeklarasian variabel lokal, kita harus menuliskan lengkap mulai dari tipe data, nama variabel dan juga
nilai awalnya.

Praktek
Pada editor terdapat class Test yang berisi method main() dengan satu buah variabel bertipe String. Jalankan kode 
dan lihat outputnya.
Coba ganti nilai variabel pesan dengan namamu, lalu jalankan lagi kode program untuk melihat hasilnya.
 */