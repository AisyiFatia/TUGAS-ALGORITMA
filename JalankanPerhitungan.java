import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args){
        Perhitungan s = new Perhitungan(7, 3, 2 );
        s.PrintJudul();
        int hasilTambah = s.HasilTbh(7, 3);
        System.out.println("Hasil tambah = "+hasilTambah);
        int HasilPerkalian = s.HasilKali(7, 3);
        System.out.println("Hasil Perkalian = "+HasilPerkalian);


        // Tugas / TM
        // Tampilkan hasil perhitungan dengan memanggil method
        // yang ada pada Perhitungan.java. Method yang dibuat, menerima
        // Parameter dan mengembalikan nilai (method with return)
        // Hasil diemail berupa github repo masing2 siswa
        // Subject email : TM_NIM_NAMALENGKAP_KELAS
        //e.g : TM_21090077_ROHADATUL AISYI FATIKHA_2C
    }
}