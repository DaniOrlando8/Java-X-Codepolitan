public class Main {
    public static void main(String[] args) {
        int [] angka = {10, 20, 30, 40, 50};

        for(int x : angka){
            System.out.println(x * 10);
        }

    }
}
/**
 * Kita dapat menyusuri setiap nilai di dalam sebuah array menggunakan for. Array adalah variabel yang dapat 
 memuat nilai lebih dari satu. Ada beberapa teknik untuk menyusuri setiap nilai di dalam array. Contohnya seperti 
 ini:

int[] array = {10, 20, 30, 40, 50};
for (int i=0; i < array.length; i++){
    System.out.println(array[i]);
}

Namun di Java, kita dapat melakukan hal tersebut dengan kode yang lebih sederhana:

int[] array = {10, 20, 30, 40, 50};
for (int a: array) {
    System.out.println(a);
}

Setiap nilai pada array akan disusuri dari indeks ke-0 hingga akhir dan nilai tersebut dapat kita panggil pada 
variabel pencacah a. Tipe data dari variabel pencacah harus sama dengan tipe data arraynya.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan.
Pembahasan lebih dalam terkait Array akan kamu temukan pada pembahasan kedepan.
 */