public class Menu {
    public static void main(String[] args) {
        int  menu = 4;

        switch (menu) {
            case 1:
                System.out.println("Kamu memilih menu - Ayam penyet");
                break;
            case 2:
                System.out.println("Kamu memilih menu - Pepes kakap");
                break;
            case 3:
                System.out.println("Kamu memilih menu - Rendang");
                break;
            case 4:
                System.out.println("Kamu memilih menu - Telur dadar");
                break;
            default:
                System.out.println("Maaf, menu tidak ada");
                break;
        }
    }
}
/**
 * Statemen Switch
    Cara lain untuk membangun kondisi yang cukup banyak yaitu dengan menggunakan switch. Di dalamnya terdapat 
    statemen switch, case, dan default. Statemen switch digunakan untuk menjalankan satu diantara banyak blok 
    kode berdasarkan kecocokan nilai yang dievaluasi.

switch(variabel){
   case a:
      // blok kode A
      break;
   case b:
      // blok kode B
      break;
   ...
   default:
      // blok kode default
}
    Pada statemen switch, nilai variabel akan dievaluasi kecocokannya untuk setiap case. Bila ditemukan kecocokan
    pada salah satu case, maka blok kode pada case tersebut akan dijalankan. Umumnya blok kode pada setiap case 
    diakhiri dengan perintah break; agar program langsung keluar dari blok statemen switch dan tidak perlu lagi 
    mengecek sisa case di bawahnya.

    Apabila tidak ada case yang cocok dengan nilai variabel, maka blok kode pada bagian default yang akan 
    dijalankan.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Coba ganti nilai variabel menu dengan 1, 2, dan 3 dan lihat output yang tampil.
Tambahkan case 5 dengan output "Kamu memilih menu - Nasi Goreng". Kemudian coba ganti nilai variabel menu menjadi 
5 dan jalankan kembali program untuk memastikan output yang ditampilkan sesuai dengan yang kita inginkan.
Tambahkan blok kode untuk case 5 setelah baris kode `break;` pada baris ke-17:

case 5:
  System.out.println("Kamu memilih menu - Nasi Goreng");
  break;
 */