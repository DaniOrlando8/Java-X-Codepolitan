public class Lingkaran {

    static int radius;
    static final double PI = 3.14;

    public static void main(String[] args) throws Exception {

        Lingkaran.radius = 7;
        double luas = (Lingkaran.radius * Lingkaran.radius * Lingkaran.PI);
        System.out.println("Jari-jari: " + Lingkaran.radius);
        System.out.println("Luas: " + luas);

    }
}
/**
 * Konstanta di Java
Konstanta pada pemrograman berfungsi mirip dengan variabel. Bedanya variabel dapat kita ubah isinya selama runtime,
sedangkan konstanta tidak.

Di Java sebenarnya tidak ada term konstanta. Namun kita dapat membuat variabel yang bersifat seperti konstanta 
dengan menambahkan kata final pada deklarasi variabel sebelum menuliskan tipe data. Dan seperti konstanta umumnya,
pada Java juga kita dianjurkan untuk menuliskan final variabel dengan menggunakan nama variabel menggunakan huruf
kapital.

static final float PI = 3,14;
 */