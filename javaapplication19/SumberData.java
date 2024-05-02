/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;

public class SumberData extends DataDibutuhkan {
    private int jenisSumber;
    private String judulSumber;
    private int tahunSumber;
    private int penggunaanData;

    public SumberData(int jenisSumber, String judulSumber, int tahunSumber, int penggunaanData){
        this.jenisSumber = jenisSumber;
        this.judulSumber = judulSumber;
        this.tahunSumber = tahunSumber;
        this.penggunaanData = penggunaanData;
    }

    public void setjenisSumber(int jenisSumber){
        this.jenisSumber = jenisSumber;
    }

    public void setjudulSumber(String judulSumber){
        this.judulSumber = judulSumber; 
    }

    public void settahunSumber(int tahunSumber){
        this.tahunSumber = tahunSumber;
    }

    public void setpenggunaanData(int penggunaanData){
        this.penggunaanData = penggunaanData;
    }

    public int getjenisSumber(){
        return this.jenisSumber;
    }

    public String getjudulSumber(){
        return this.judulSumber;
    }

    public int gettahunSumber(){
        return this.tahunSumber;
    }

    public int getpenggunaanData(){
        return this.penggunaanData;
    }

    public String jenisSumberToString(int jenisSumber){
        switch(jenisSumber){
            case 1: return "Publikasi";
            case 2: return "Data Mikro";
            case 3: return "Peta";
            case 4: return "Tabulasi Data";
            case 5: return "Tabel di Website";
        }
        return "Kode tidak ditemukan";
    }

    public String penggunaanDataToString(int penggunaanData){
        if(penggunaanData == 1){
            return "Ya";
        } else {
            return "Tidak";
        }
    }

    public void print1(){
        System.out.println("\n<< Sumber Data >>");
        System.out.println("Jenis Sumber Data : "+jenisSumberToString(jenisSumber));
        System.out.println("Judul Sumber Data : "+getjudulSumber());
        System.out.println("Tahun Sumber Data : "+gettahunSumber());
    }
    
    public void print2(){
        System.out.println("\n<< Sumber Data >>");
        System.out.println("Jenis Sumber Data : "+jenisSumberToString(jenisSumber));
        System.out.println("Judul Sumber Data : "+getjudulSumber());
        System.out.println("Tahun Sumber Data : "+gettahunSumber());
        System.out.println("Apakah data ini digunakan untuk perencanaan, monitoring, dan evaluasi pembangunan nasional? " + penggunaanDataToString(penggunaanData));
    }
}
