public class Main {
    public static void main(String[] args) {
        String[] sayuran = {"kangkung","bayam","brokoli"};

        System.out.println(sayuran[0]);
    }
}
/*
    Array
    
    Array (dikenal juga dengan istilah larik) adalah tipe variabel yang dapat menyimpan lebih dari satu nilai. 
    Misalnya kita punya himpunan nama hewan yang ingin diproses di dalam program, maka kita dapat menyimpan ke 
    dalam variabel seperti ini:

String hewan1 = "ayam";
String hewan2 = "sapi";
String hewan3 = "kuda";

Permasalahannya sekarang adalah bagaimana bila kita hendak melakukan pencarian nama hewan diantara daftar nama 
tersebut? Selain itu bagaimana bila kita ingin mencetak semua daftar nama yang boleh jadi tidak hanya ada 3-4 buah, 
tapi ratusan? Penggunaan himpunan variabel dalam jumlah banyak akan menyulitkan proses data tersebut. Disinilah 
peran Array.

Array dibuat seperti berikut:

tipedata[] namavar = new tipedata[jumlahdata];
Atau kita dapat langsung menginisiasi nilai arraynya seperti ini:

tipedata[] namavar = {data1, data2, ..};
Sebagai contoh, bila data nama hewan di atas disimpan dalam bentuk array, maka sintaks penulisannya seperti ini:

String[] hewan = new String[3];
hewan[0] = "ayam";
hewan[1] = "sapi";
hewan[2] = "kuda";
atau seperti ini:

String[] hewan = {"ayam", "sapi", "kuda"};
Kita dapat mengisikan atau memanggil nilai array dengan menggunakan nomor indeksnya.

hewan[0] = "kambing";
System.out.println(hewan[0]);
Indeks adalah nomor posisi nilai di dalam array. Nomor indeks dimulai dari 0.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Dapatkah Kamu mencetak nama-nama sayuran dari variabel array tersebut, sehingga hasilnya tampil seperti ini:

Beberapa nama sayuran:
kangkung
bayam
brokoli

*/