class Main {
    public static void main(String[] args) throws Exception {
        byte a = 127;                   // rentang -128 sampai 127
        short b = 32767;                // rentang -32.767 samapai 32.767
        int c = 2147483647;             // rentang -2.147.483.648 sampai 2.147.483.647
        long d = 9223372036854775807L;  // rentang -9.223.372.036.854.775.808 dan 9.223.372.036.854.775.807
        float e = 32.0f;                // rentang 32-bit IEEE 754 floating point
        double f = 62.0;                // rentang 64-bit IEEE 754 floating point
        boolean g = true;               // true dan false saja. Selain itu akan error
        String h = "String";            // alfanumerik dan tanda baca yang diapit dengan tanda petik dua (")
        char i = 'A';                   // alfanumerik dan tanda baca yang diapit dengan tanda petik satu (')

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

    }
}
/**
 * Tipe Data
    Ada beberapa tipe data dasar yang wajib kamu ketahui bila ingin membuat sebuah aplikasi dengan bahasa pemrograman 
    Java, diantaranya:

- byte, diisi dengan angka bulat bukan bilangan koma dengan rentang -128 hingga 127
- short, diisi dengan angka bulat bukan bilangan koma dengan rentang -32.767 hingga 32.767
- int, diisi dengan angka bulat bukan bilangan koma dengan rentang -2.147.483.648 hingga 2.147.483.647
- long, diisi dengan angka bulat bukan bilangan koma dengan rentang -9.223.372.036.854.775.808 hingga 
  9.223.372.036.854.775.807
- float, diisi dengan bilangan koma dengan rentang 32-bit IEEE 754 floating point
- double, diisi dengan bilangan koma dengan rentang 64-bit IEEE 754 floating point
- boolean, diisi dengan true dan false saja. Selain itu akan error
- String, diisi dengan rangkaian alfanumerik dan tanda baca yang diapit dengan tanda petik dua (")
- char, diisi dengan alfanumerik yang diapit dengan tanda petik satu (')

Kamu dapat membuat sebuah variabel di dalam method yang tentu saja akan menjadi variabel lokal di dalam method 
tersebut. Atau menjadikannya atribut suatu kelas, namun harus menginstansiasi atau membuat objeknya dahulu bila 
ingin menggunakan variabel tersebut.

Setelah membuat variabel, kamu dapat melakukan berbagai operasi seperti operasi aritmatika dan menampilkannya 
ke konsol.
 */