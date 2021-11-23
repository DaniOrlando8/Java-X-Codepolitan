public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
/**
 * Pada statemen while dan do-while, kondisi yang dicek tidak mesti berupa angka yang diiterasi, tapi bisa juga
   pengecekan kondisi lain yang kita tak perlu ketahui berapa kali harus dijalankan. Sedangkan statemen perulangan 
   for lebih khusus digunakan apabila kita hendak mengulang eksekusi blok kode sebanyak angka yang kita tentukan.

Dalam pengulangan dengan for diperlukan sebuah variabel dengan nilai awal untuk diiterasi (biasanya berupa integer), 
kemudian kondisi untuk membatasi iterasi, dan increment atau decrement variabel.

for (inisiasi counter; kondisi; increment/decrement counter) {
    // kode yang akan dijalankan berulang
}
Parameter pertama adalah inisial variabel yang akan dijadikan penghitung.
Parameter kedua adalah pengecekan kondisi variabel. Selama kondisi bernilai true, blok kode akan dijalankan.
Parameter ketiga untuk menaikkan/menurunkan nilai variabel setiap kali blok kode selesai dijalankan.
Setiap parameter dipisahkan dengan tanda titik koma.
for(int x = 0; x < 5; x++){
   System.out.println(x);
}
Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Coba modifikasi statemen for sehingga output menampilkan angka dari 10 hingga 1.
for (int i = 10; i > 0; i--) {
    System.out.println(i);
}
 */