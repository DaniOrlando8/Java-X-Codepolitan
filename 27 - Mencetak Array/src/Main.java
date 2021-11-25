import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] sayuran = {"kangkung", "bayam", "brokoli"};
        
		System.out.println(Arrays.toString(sayuran));
    }
}
/**
 * Mencetak Array
Kita dapat menampilkan isi dari sebuah array dengan menggunakan method toString() dari library Arrays.

String[] sayuran = {"kangkung", "bayam", "brokoli"};
System.out.println(Arrays.toString(sayuran));
Method Arrays.toString() akan mengembalikan isi sebuah array dalam bentuk string. Untuk dapat menggunakan 
method ini kita harus mengimpor terlebih dahulu library Arrays di bagian atas file.

import java.util.Arrays;
Selain itu kita juga dapat menampilkan isi array multidimensi dengan menggunakan method Arrays.deepToString().

Kedua method ini akan sangat berguna dalam proses debugging, bila kita ingin mengetahui apa saja isi sebuah array 
dengan cepat.

Praktek
Jalankan kode di editor dan lihat output apa yang ditampilkan.
 */