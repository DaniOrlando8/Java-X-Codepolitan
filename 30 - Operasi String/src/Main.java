public class Main {
    public static void main(String[] args) throws Exception {
        String nama = "Ucup Surucup";
        int usia = 23;

        System.out.println("Nama : " + nama + "\nUsia : " + usia);
    }
}
/**
 * Operasi String
Di Java, kamu dapat melakukan operasi string dasar seperti penambahan string, mencari panjang string, dan string 
formatting.

Kamu dapat mencari panjang string dengan menggunakan method length() pada variabel string. Kamu juga dapat melakukan 
string formatting untuk memperelok kode program kamu agar lebih mudah terbaca. Untuk mencetak string dengan menggunakan 
format, kita dapat menggunakan method System.out.printf().

Beberapa tanda string formatting yang dapat kamu ingat antara lain:

%s diisi oleh string lain
%f diisi oleh bilangan koma
%d diisi oleh bilangan bulat
Perhatikan contoh berikut:

String produk = "Pasta gigi":
int harga = 2500;
System.out.printf("Produk: " + produk + " Harga: Rp " + harga);
Contoh kode di atas akan menampilkan output:

Produk: Pasta gigi - Harga Rp 2500

Sekarang dengan menggunakan formatting seperti kode berikut:

String produk = "Pasta gigi":
int harga = 2500;
System.out.printf("Produk: %s - Harga: Rp %d", produk, harga);
kode kita akan nampak lebih rapi dan lebih mudah dibaca karena tidak menggunakan operator konkatenansi yang banyak.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan.
Ganti kode di baris ke-6 untuk menampilkan output menggunakan System.out.printf() dengan formatting seperti materi 
di atas sehingga tampil hasil yang serupa seperti sebelumnya.
System.out.printf("Nama: %s \nUsia: %d", nama, usia);

class Main {
    public static void main (String[] args) {
        String nama = "Tsubasa Ozora";
        int usia = 34;
      
        System.out.println("Nama: " + nama + "\nUsia: " + usia);
    }
}

 */