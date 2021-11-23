public class Assigment {
    public static void main(String[] args) {
        // Mendefenisikan variabel
        int x = 10;
        int y = 15;

        // Menggunakan operator  +=
        x += y;
        System.out.println(x);

        // Menggunakan Operator -=
        x -= y;
        System.out.println(x);

        // Menggunakan Operator *=
        x *= y;
        System.out.println(x);

        // Menggunakan Operator /=
        x /= y;
        System.out.println(x);

        // Menggunakan Operator %=
        x %= y;
        System.out.println(y);

        
    }
}
/**
 * Operator assignment digunakan untuk mengisikan nilai pada variabel. Operator assignment yang sudah kita gunakan 
 * pada bagian sebelumnya adalah =. Selain itu ada beberapa operator assignment lain yang dapat kita gunakan, 
 * diantaranya:
    += melakukan operasi penambahan variabel terhadap variabel itu sendiri
    -= melakukan operasi pengurangan variabel terhadap variabel itu sendiri
    *= melakukan operasi perkalian variabel terhadap variabel itu sendiri
    /= melakukan operasi pembagian variabel terhadap variabel itu sendiri
    %= melakukan operasi modulus variabel terhadap variabel itu sendiri
    
    Sebagai contoh, kode berikut:

    x = x + 1;
    y = y - x;
    z = z * y;
    
    dapat ditulis lebih sederhana menjadi:

    x += 1;
    y -= x;
    z *= y;

 */