/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;

import java.util.Scanner;

public class DataDibutuhkan  extends Responden {
    private int noData;
    private String jenisData;
    private int tahunData;
    private int levelData; //String diganti jadi int ngikut kode dibawah formnya
    private int periodeData; //String diganti jadi int ngikut kode dibawah formnya
    private int perolehanData;
    private SumberData sumberData;
    private KepuasanData kepuasanData;
    private String jawabanLain;

    public DataDibutuhkan(int noData, String jenisData, int tahunData, int levelData, int periodeData, int perolehanData){
        this.noData = noData;
        this.jenisData = jenisData;
        this.tahunData = tahunData;
        this.levelData = levelData;
        this.periodeData = periodeData;
        this.perolehanData = perolehanData;
    }

    public DataDibutuhkan(){
    }

    public void setNoData(int noData){
        this.noData = noData;
    }

    public void setJenisData(String jenisData){
        this.jenisData = jenisData;
    }

    public void setTahunData(int tahunData){
        this.tahunData = tahunData;
    }

    public void setLevelData(int levelData){
        this.levelData = levelData;
    }

    public void setPeriodeData(int periodeData){
        this.periodeData = periodeData;
    }

    public void setPerolehanData(int perolehanData){
        this.perolehanData = perolehanData;
    }

    public int getNoData(){
        return this.noData; 
    }

    public String getJenisData(){
        return this.jenisData;
    }

    public int getTahunData(){
        return this.tahunData;
    }

    public int getLevelData(){
        return this.levelData;
    }

    public int getPeriodeData(){
        return this.periodeData;
    }

    public int getPerolehanData(){
        return this.perolehanData;
    }

    public SumberData getSumberData() {
        return sumberData;
    }

    public void setSumberData(SumberData sumberData) {
        this.sumberData = sumberData;
    }

    public KepuasanData getKepuasanData() {
        return kepuasanData;
    }

    public void setKepuasanData(KepuasanData kepuasanData) {
        this.kepuasanData = kepuasanData;
    }

    public String getJawabanLain() {
        return jawabanLain;
    }

    public void setJawabanLain(String jawabanLain) {
        this.jawabanLain = jawabanLain;
    }
    
   public String levelDataToString(int levelData, Scanner scanner){
        switch(levelData){
            case 1: return "Nasional";
            case 2: return "Provinsi";
            case 3: return "Kabupaten/Kota";
            case 4: return "Kecamatan";
            case 5: return "Desa/Kelurahan";
            case 6: return "Individu";
            case 7: return "Lainnya(sebutkan) : " + scanner.nextLine();
        }
        return "Kode tidak ditemukan";
    }

    public String periodeDataToString(int periodeData, Scanner scanner){
        switch(periodeData){
            case 1: return "Sepuluh tahunan";
            case 2: return "Lima tahunan";
            case 3: return "Tiga tahunan";
            case 4: return "Tahunan";
            case 5: return "Semesteran";
            case 6: return "Triwulanan";
            case 7: return "Bulanan";
            case 8: return "Mingguan";
            case 9: return "Harian";
            case 10: return "Lainnya(sebutkan) : " + scanner.nextLine();
        }
        return "Kode tidak ditemukan";
    }

    public String perolehanDataToString(int perolehanData){
        switch(perolehanData){
            case 1: return "Ya, sesuai";
            case 2: return "Ya, tidak sesuai";
            case 3: return "Tidak diperoleh";
            case 4: return "Belum diperoleh";
        }
        return "Kode tidak ditemukan";
    }

    public void print(){
        System.out.println(
                "\n===========================================================================================================================================" +
                "\n                                                             ISIAN BLOK III                                                                  " +
                "\n===========================================================================================================================================" );
        System.out.println("<< Data yang Dibutuhkan/Dikonsultasikan >>");
        System.out.println("No : "+noData);
        System.out.println("Jenis Data : "+jenisData);
        System.out.println("Tahun Data : "+tahunData);
        System.out.println("Level Data : "+levelDataToString(levelData, new Scanner(System.in)));
        System.out.println("Periode Data : "+periodeDataToString(periodeData, new Scanner(System.in)));
        System.out.println("Apakah data pada kolom (2)-(5) sudah diperoleh? : "+perolehanDataToString(perolehanData));
    }
}
