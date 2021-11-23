public class Test {
	String pesan = "Selamat Belajar";

	public static void main(String args[]) {
    	Test tes = new Test();
    	System.out.println(tes.pesan); 
	}
}
/**
 * Instance Variable
Instance variable adalah variabel yang dideklarasikan di dalam class, tetapi di luar method. Instance variable 
biasanya dibuat bila kita membutuhkan variabel yang akan digunakan oleh lebih dari satu method.

Berbeda dengan local variable, instance variable tidak mesti ditulis dengan nilai awal. Bila nilai awal tidak 
dideklarasikan, maka nilai default untuk instance variable adalah 0 bila bertipe integer, false bila bertipe 
boolean, dan null untuk referensi objek.

Instance variable dapat dipanggil langsung dengan namanya di dalam class, kecuali method static. Pada method 
static seperti main(), variabel dapat dipanggil melalui objeknya namaObjek.namaVariabel.
 */