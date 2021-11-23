public class Bitwise {
    public static void main(String[] args) {
        // definisi variabel
		int x = 60;
		int y = 13;

		// menggunakan operator &
		System.out.println(x & y);

		// menggunakan operator |
		System.out.println(x | y);
		
		// menggunakan operator ^
		System.out.println(x ^ y);

		// menggunakan operator ~
		System.out.println(~ x);
		
		// menggunakan operator >>	
		System.out.println(x >> 2);

		// menggunakan operator <<
		System.out.println(x << 2);
    }
}
/**
 * Operator Bitwise
Operator bitwise digunakan untuk menangani operasi bit pada suatu bilangan dalam representasi biner. 
Operator bitwise yang harus kamu ingat antara lain:

& melakukan operasi AND terhadap dua bilangan biner
| melakukan operasi OR terhadap dua bilangan biner
^ melakukan operasi XOR terhadap dua bilangan biner
~ melakukan operasi negasi terhadap bilangan biner
>> n melakukan operasi penggeseran bit ke kanan terhadap bilangan biner sebanyak n bit
<< n melakukan operasi penggeseran bit ke kiri terhadap bilangan biner sebanyak n bit

x & y
0011 1100
0000 1101
---------
0000 1100
x | y
0011 1100
0000 1101
---------
0011 1101
x ^ y
0011 1100
0000 1101
---------
0011 0001
~x
0011 1100
---------
1100 0011
x >> 2
0011 1100
---------
0000 1111
x << 2
0011 1100
---------
1111 0000


 */