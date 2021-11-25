/**
 * Senjata
 */
class Senjata {
    String tipe;
    String nama;
    double bobot;
    double panjang;

    public Senjata(String tipe, String nama, double bobot, double panjang){
        this.tipe = tipe;
        this.nama = nama;
        this.bobot = bobot;
        this.panjang = panjang;
    }

    public String getString(){
        return nama + " - " + tipe + " - " + bobot + " kg " + panjang + " Cm ";
    }
    
}
public class Main {
    public static void main(String[] args) throws Exception {
        Senjata senjata[] ={
            new Senjata("Two-handed Sword", "The Executioner", 80.0, 200.0),
			new Senjata("Two-handed Axe", "The Great Skull Axe", 100.0, 150.0),
			new Senjata("Dagger", "Stilleto", 20.0, 50.0)
        };
        System.out.println("Jenis-jenis Senjata");

        for (Senjata s: senjata){
			System.out.println( "- " + s.getString() );
		}
    }
}
/**
 * Variasi Array
Setiap variabel array harus berisi nilai dengan tipe yang sama. Misalkan array integer, maka semua nilai di dalam 
variabel array tersebut harus bertipe integer.

int[] angka = {1, 2, 3, 4, 5};
Bila kita memasukkan nilai bertipe lain ke dalam variabel bertipe integer di atas:

int[] angka = {"satu", 2, 3, 4, 5};
maka compiler akan menampilkan pesan kesalahan incompatible types.

Selain menggunakan tipe data standar yang sudah kita bahas di awal tutorial, array juga dapat dibuat dari objek yang 
kita buat sendiri. Hal ini akan sering digunakan pada saat memprogram karena adakalanya kita perlu menyimpan koleksi 
data dalam bentuk yang tidak umum.

Pada materi Class dan Objek mendatang akan dibahas lebih dalam mengenai class dan objek di Java. Adapun kali ini kita 
akan melihat bagaimana sebuah objek dapat disimpan di dalam array objek.

Praktek
Pada editor terdapat dua buah class, yakni class Senjata dan class Main. Class Senjata adalah class yang akan kita 
gunakan untuk membuat objek Senjata. Objek ini nantinya akan menyimpan struktur data seperti nama senjata, tipe senjata, 
bobot dan panjangnya.

Pada class Main terdapat method main yang disitu program akan dijalankan. Pada method main juga kita membuat array untuk 
objek Senjata.

Silakan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
 */