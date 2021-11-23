public class Message {
    String pesan = "Hallo semua!";
    public static void main(String[] args) {
        Message tes = new Message();

        System.out.println(tes instanceof Message);
        System.out.println(tes.pesan instanceof String);
    }
}
/**
 * Operator Instanceof
Untuk memeriksa apakah suatu objek merupakan hasil instansiasi dari suatu class, kamu dapat menggunakan instanceof.

namaObjek instanceof NamaClass;
Kondisi akan menghasilkan nilai true bila namaObjek adalah benar hasil instansiasi dari class namaClass, 
dan menghasilkan nilai false bila namaObjek bukan hasil instansiasi dari class namaClass.

Operator ini berguna bila suatu saat kamu ingin memeriksa suatu objek sebelum melakukan operasi selanjutnya.
 */