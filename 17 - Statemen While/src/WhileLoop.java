public class WhileLoop {
    public static void main(String[] args) {
        int x = 0;

        while(x > 10){
            System.out.println("x");
            x++;
        }
    }
}
/**
 * Statemen perulangan while akan menjalankan blok kode berulang-ulang selama kondisi masih bernilai true.

while (kondisi) {
    // kode yang akan dijalankan berulang
}
Sebagai contoh kode berikut:

int x = 1;
while(x <= 5)
{
    System.out.println(x);
    x++;
}
Pada kode di atas, program akan mencetak nomor 1 sampai dengan 5. Statemen while akan mengecek kondisi, yang
apabila nilainya true, dia akan menjalankan blok kode di dalamnya. Statemen while akan terus dijalankan sampai 
kondisi pada while bernilai false. Sehingga kita harus menyiapkan skenario agar kondisi bernilai false.

Pengubah kondisi dapat berupa decrement / increment atau cukup mengubah nilai suatu variabel yang digunakan di 
kondisi while. Pada kode di atas kita menambah nilai variabel x sebanyak 1 setiap kali blok kode pada while 
dijalankan, agar sampai pada kondisi nilai $x lebih dari 5 sehingga pengecekan kondisi bernilai false.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Coba ganti kondisi dan juga variaibel pengubahnya sehingga program mencetak output angka dari 10 hingga 0
int x = 10;
while (x >= 0)
{
  System.out.println(x);
  x--;
}
Pastikan kamu mengurangi variabel x setiap eksekusi perulangan agar tidak terjadi infinite loop!

class WhileLoop {
    public static void main (String[] args) {
        int x = 0;
​
        while (x < 10)
        {
            System.out.println(x);
            x++;
        }
    }
}


 */