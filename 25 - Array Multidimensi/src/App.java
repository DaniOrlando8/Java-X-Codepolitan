public class App {
	public static void main (String[] args) {
		int[][] matrixA = {{3,4,5},{3,4,5},{3,4,5}};
		int[][] matrixB = {{5,4,3},{5,4,3},{5,4,3}};
		int[][] matrixC = new int[3][3];

		// menjumlahkan matrixA dan matrixB
      	// kemudian menyimpan hasilnya ke matrixC
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}

		// mencetak matrixA
      	System.out.println("matrixA");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrixA[i][j] + ",");
			}
			System.out.println();
		}

      	// mencetak matrixB
		System.out.println("\nmatrixB");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrixB[i][j] + ",");
			}
			System.out.println();
		}

      	// mencetak matrixC
		System.out.println("\nmatrixA + matrixB");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrixC[i][j] + ",");
			}
			System.out.println();
		}	
      
	}
}

/**
 * Matriks atau dikenal juga dengan array multidimensi adalah array yang memiliki deret data dua dimensi atau lebih.
 Untuk mendefinisikan matriks dua dimensi, Kamu dapat membuat seperti berikut:

tipedata[][] namavar = new tipedata[jumlahKolom][jumlahBaris];
Misalnya kita membuat array integer dua dimensi dengan dua kolom dan dua baris seperti berikut:

int[][] matriks2Dimensi = new int[2][2];
matriks2Dimensi[0][0] = 1;
matriks2Dimensi[0][1] = 2;
matriks2Dimensi[1][0] = 3;
matriks2Dimensi[1][1] = 4;
Sama halnya bila Kamu hendak membuat array tiga dimensi, cukup definisikan ukuran array per dimensinya.

int[][][] matriks3Dimensi = new int[2][2][2];
Praktek
Pada editor terdapat contoh kode penjumlahan matriks ordo 3x3. Penjumlahan matriks sederhananya adalah menjumlahkan
nilai dari setiap elemen matriks yang posisinya sama. Silahkan eksekusi kode di sebelah kanan dan lihat output yang
akan dihasilkan

Dapatkah kamu memodifikasi kode di editor sehingga matrixC berisi hasil dari matrixA dikurangi matrixB?
Kamu dapat mencoba membuat operasi lain pada matriks seperti perkalian, mencari determinan, mencari nilai faktor 
eigen, dan lain sebagainya di Java.

 */