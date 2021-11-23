public class Nilai {
    public static void main(String[] args) {
        
        int nilai = 90;
        int minimum = 75;

        if(nilai > minimum){
            System.out.println("Nilai diatas rata-rata");
        }else{
            System.out.println("Nilai dibawah rata-rata");
        }
    }
}
/**
 * Statemen If
    Seringkali kita harus melakukan suatu operasi hanya pada kondisi tertentu saja. Artinya kita mengecek terlebih
    dahulu sebuah kondisi, yang apabila kondisi tersebut terpenuhi (atau bernilai true), maka kita lakukan 
    serangkaian operasi.

    Statemen if digunakan untuk mengecek kondisi dan bila kondisi bernilai true, maka program tertentu akan 
    dijalankan. Statemen if memerlukan sebuah kondisi yang dibangun dengan menggunakan operator logika dan 
    operator relasional. Penulisan sintaksnya adalah:

if (kondisi){
    // blok kode
}

    Adakalanya kita harus mengeksekusi satu blok kode program saat suatu kondisi terpenuhi, dan mengeksekusi blok kode 
    program lain yang berbeda bila kondisi tidak terpenuhi. Untuk itu kita gunakan statemen if..else.

if (kondisi){
    // blok kode bila kondisi true
} else {
    // blok kode bila kondisi false
}

Praktek
Silahkan eksekusi kode di editor dan lihat output yang akan dihasilkan
Ganti nilai variabel nilai menjadi 60, lalu jalankan kembali program. Output apakah yang muncul?

 */