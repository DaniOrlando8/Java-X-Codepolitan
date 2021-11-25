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