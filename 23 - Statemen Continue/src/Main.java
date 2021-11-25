public class Main {
    public static void main(String[] args) {

        // cetak hanya angka ganjil saja
        for (int i = 0; i < 20; i++) {

            // bila habis dibagi dua
            // lanjutkan ke iterasi selanjutnya
            if(i % 2 == 0){
                continue;
            }
            
            // bila kondisi di atas terpenuhi
            // kode di bawah ini akan dilewati
            System.out.println(i);
        }
    }
}
/**
 * Statemen Continue
Penggunaan continue digunakan untuk meneruskan langsung ke perulangan selanjutnya. Seperti halnya break, 
continue biasanya digunakan bersamaan dengan pengecekan suatu kondisi.

Bila pada break perulangan akan dihentikan sama sekali, pada continue perulangan akan dilewatkan ke iterasi 
selanjutnya.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Dapatkah Kamu memodifikasi kode di editor sehingga hanya angka genap saja yang dicetak?
Ganti pengecekan kondisi continue menjadi seperti ini:

if (i % 2 != 0) {
    continue;
}

 */