//Maksud Program ini mendefinisikan sebuah kelas bernama Kipas, yang digunakan untuk menyimpan dan menampilkan merek dari kipas angin. Program ini juga memiliki kelas Main yang merupakan titik awal untuk menjalankan program, di mana objek dari kelas Kipas dibuat dan merek kipas ditampilkan.
class Kipas { //mendefinikan kelas bernama "Kipas"
    String merk; //mendeklarasikan variabel merk bertipe string untuk menyimpan nama merek kipas

    Kipas(String merk) { //Konstruktor dari kelas Kipas yang menerima satu parameter bertipe String untuk menginisialisasi merek kipas.
        this.merk = merk;  //Menggunakan kata kunci this untuk membedakan antara variabel instance merk dan parameter merk, dan menginisialisasi variabel instance dengan nilai parameter.
    }

    void tampilkanMerk() { //Mendefinisikan metode tampilkanMerk yang tidak mengembalikan nilai (void).
        System.out.println("Merk kipas: "+ this.merk); //Menampilkan merek kipas ke konsol dengan mencetak string dan nilai dari this.merk.
    }
}

public class Main { //Mendefinisikan kelas Main, yang merupakan kelas utama tempat fungsi main berada.
    public static void main(String[] args) { //Menyatakan method main, yang merupakan titik masuk eksekusi program Java.
        Kipas k = new Kipas("Miyako"); //Membuat objek k dari kelas Kipas dan menginisialisasi mereknya dengan "Miyako".
        k.tampilkanMerk(); //Memanggil metode tampilkanMerk pada objek k untuk menampilkan merek kipas ke konsol.
    }   
}
