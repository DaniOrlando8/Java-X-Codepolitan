public class Nilai {
    public static void main(String[] args) {
        
        int nilai = 75;
        int skbm = 75;

        if(nilai > skbm){
            System.out.println("Nilai diatas rata-rata");
        }else if (nilai == skbm) {
            System.out.println("Nilai pas dengan rata-rata");
        }else{
            System.out.println("Nilai dibawah rata-rata");
        }
    }
}
/**
 * Statemen If Else If
    Adakalanya kita harus mengecek beberapa kondisi dan hanya menjalankan kode dari salahsatu kondisi yang terpenuhi saja. Untuk itu kita dapat menggunakan statemen if..else if..else dst.

    if(kondisi a){
        // kode bila kondisi a terpenuhi
    } else if(kondisi b){
    // kode bila kondisi b terpenuhi
    ..
    ..
    } else if(kondisi n) {
    // kode bila kondisi n terpenuhi
    } else {
    // kode bila semua kondisi tidak terpenuhi  
    }

    Praktek
    Silahkan eksekusi kode di editor dan lihat output yang akan dihasilkan
    Coba ganti nilai pada variabel nilai dan jalankan lagi kode untuk melihat hasilnya.
 */
