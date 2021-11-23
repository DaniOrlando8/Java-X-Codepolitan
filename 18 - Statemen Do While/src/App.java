public class App {
    public static void main(String[] args) throws Exception {
        int x = 0;
        
        do{
            System.out.println(x);
            x++;
        }while(x < 10);
    }
}
/**
 * Statemen Do While
Hampir sama dengan statemen while hanya saja pengecekan kondisi dilakukan di akhir. Sehingga program paling tidak 
menjalankan iterasi minimal satu kali. Secara umum format do while adalah sebagai berikut:

do {
    // proses
    // iterasi
} while ( kondisi );
Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Dapatkah Kamu memodifikasi kode program sehingga output menampilkan angka 10 sampai 1.
int x = 10;
do {
    System.out.println(x);
    x--;
} while (x > 0);
Pastikan kamu mengurangi variabel x setiap eksekusi perulangan agar tidak terjadi infinite loop!

 */