public class Main {
    public static void main(String[] args) {
        String [] sayuran ={
                            "Bayam","Kanggku","Tomat",
                            "Mentimun","Tomat","Selada",
                            "Brokoli"
                        };
       System.out.println("Mencari Tomat di array sayuran : ");

       for (String sayur : sayuran){
           System.out.println(sayur);
           if (sayur == "Tomat") {
               System.out.println("Tomat berhasil ditemukan!");
               break;
           }
       }
    }
}
/**
 * Penggunaan break digunakan untuk memutus perulangan. Biasanya break digunakan bersamaan dengan pengecekan 
    kondisi menggunakan if atau switch. Pengecekan kondisi dibuat di dalam blok kode yang diulang.

Statemen break dapat digunakan untuk menginterupsi semua jenis statemen perulangan, baik itu for, while dan 
do-while.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Kamu dapat mencoba mengganti pengecekan kondisi di bagian if (sayur == "tomat") dengan nama sayuran lain untuk 
memastikan perulangan berhenti di nama sayuran yang Kamu tulis.

 */