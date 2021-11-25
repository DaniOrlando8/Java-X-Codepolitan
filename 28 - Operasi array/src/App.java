import java.util.Arrays;

class App {
	public static void main(String[] args) {
		int[] scores = {100, 95, 80, 70, 75, 85, 80, 80, 92, 70};
      
      	System.out.println("Scores: " + Arrays.toString(scores) );

		// operasi sum/penjumlahan
		int total = 0;
		for (int val: scores){
			total += val;
		}
		System.out.println("Sum of scores: " + total);

		// operasi max/mencari nilai terbesar
		int max = 0;
		for (int val: scores){
			if (max < val){
				max = val; 
			}
		}
		System.out.println("Max of scores: " + max);
		
		// operasi min/mencari nilai terkecil
		int min = scores[0];
		for (int val: scores){
			if (min > val){
				min = val; 
			}
		}
		System.out.println("Min of scores: " + min);

	}
}
/**
 * Operasi Array
Hampir setiap operasi array dapat kita lakukang dengan memanfaatkan perulangan for. Selain itu kita juga akan membutuhkan
beberapa operator seperti relasional dan assignment.

Sekarang kita akan mencoba membuat beberapa operasi sederhana terhadap array yang berisi angka. Beberapa operasi yang 
akan kita lakukan adalah operasi max, min, sum, dan average.

Praktek
Pada editor terdapat contoh program berisi array angka dan juga beberapa operasi sederhana diantaranya sum, min, dan max.
Silakan eksekusi kode tersebut dan lihat output yang dihasilkan.
Dapatkah Kamu menghitung nilai rata-rata/average dari nilai scores? Nilai rata-rata didapatkan dari total nilai dibagi 
banyaknya nilai. Untuk mendapatkan banyaknya nilai, gunakan scores.length.

total = 0;
for (int val: scores){
    total += val;
}
System.out.println("Average of scores: " + ( total / scores.length ) );

 */