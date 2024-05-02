/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;

public class KepuasanData extends DataDibutuhkan {
    private int kelengkapanData;
    private int akurasiData;
    private int kemutakhiranData;

    public KepuasanData(int kelengkapanData, int akurasiData, int kemutakhiranData){
        this.kelengkapanData = kelengkapanData;
        this.akurasiData = akurasiData;
        this.kemutakhiranData = kemutakhiranData;
    }

    public KepuasanData() {
    }

    public void setKelengkapanData(int kelengkapanData) {
        this.kelengkapanData = kelengkapanData;
    }

    public void setAkurasiData(int akurasiData) {
        this.akurasiData = akurasiData;
    }

    public void setkemutakhiranData(int kemutakhiranData){
        this.kemutakhiranData = kemutakhiranData;
    }

    public int getKelengkapanData(){
        return this.kelengkapanData;
    }

    public int getAkurasiData(){
        return this.akurasiData;
    }

    public int getKemutakhiranData(){
        return this.kemutakhiranData;
    }

    public void print(){
        System.out.println("\n<< Tingkat Kepuasan >>");
        System.out.println("Skala 1-10 (Sangat tidak puas-Sangat puas)");
        System.out.println("Kelengkapan Data : "+kelengkapanData);
        System.out.println("Akurasi Data (sesuai fenomena) : "+akurasiData);
        System.out.println("Kemutakhiran Data : "+kemutakhiranData);
    }
}
