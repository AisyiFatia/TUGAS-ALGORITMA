package Model;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a, int _b, int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
       printJudulClass("Print judul dalam Class Perhitungan");
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        System.out.println("Judul dalam Interface");

    }

    @Override
    public void HitungTambah() {
        this.hasil = this.a + this.b;

    }

    @Override
    public void HitungKali() {
        this.hasil = this.a * this.b;

    }
}
