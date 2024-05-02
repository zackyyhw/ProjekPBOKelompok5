/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Membuat objek Pencacah
        KetPencacah pencacah1 = new KetPencacah("Zaki", "17/08/2025", "Adi", "20/09/2023", 12121162);
        pencacah1.print();//menampilkan isian Keterangan Pencacah
        FormValidasiKetPencacah formValidasiKetPencacah = new FormValidasiKetPencacah();// Membuat objek FormValidasiKetPencacah 
        List<String> errorsKetPencacah = formValidasiKetPencacah.validateKetPencacah(pencacah1);// Melakukan validasi untuk setiap atribut Pencacah
        
        // Membuat objek Responden
        Responden responden1 = new Responden("Fiona", 2000, "fiona@gmail.com", "091290008723", 2, 3, 5, "STIS", 2, 4, 16, 2, 1, 1);
        System.out.println(responden1.toString());//menampilkan isian Blok I
        FormValidasiBlok1 formValidasiBlok1 = new FormValidasiBlok1();// Membuat objek FormValidasiBlokI
        List<String> errorsBlok1 = formValidasiBlok1.validateResponden(responden1);// Melakukan validasi untuk setiap atribut Responden
        
        //Membuat objek KEPUASAN PELAYANAN
        int[] kepentingan = {5, 3, 4, 2, 15, 4, 3, 4, 5, 2, 3, 4, 5, 1, 2};
        int[] kepuasan = {4, 13, 5, 2, 4, 3, 4, 2, 5, 3, 2, 4, 5, 1, 2};

        KepuasanPelayanan kepuasanPelayanan1 = new KepuasanPelayanan(kepentingan, kepuasan);
        kepuasanPelayanan1.tampilkanBlok2();
        FormValidasiKepPelayanan formValidasiKepPelayanan = new FormValidasiKepPelayanan();
        List<String> errorsBlok2 = formValidasiKepPelayanan.validateKepPelayanan(kepuasanPelayanan1);// Melakukan validasi untuk setiap atribut Responden
        
        int jenisLayanan = responden1.getJenisLayanan();

        if(jenisLayanan == 1 || jenisLayanan == 2 || jenisLayanan == 4 || jenisLayanan == 8 || jenisLayanan == 16){  
         DataDibutuhkan datadibutuhkan1 = new DataDibutuhkan(1, "Data Survei", 2004, 2, 2, 2);
         datadibutuhkan1.print();
         FormValidasiBlok3 formValidasiBlok3_DataDibutuhkan = new FormValidasiBlok3();
        List<String> errors2 = formValidasiBlok3_DataDibutuhkan.validateDataYangDibutuhkan(datadibutuhkan1);
        
        int perolehanData = datadibutuhkan1.getPerolehanData();
        if(perolehanData == 1  || perolehanData == 2) {
            SumberData sumberdata1 = new SumberData(1, "Provinsi Jabar dalam Angka", 2004, 3);
            if(responden1.getKatInstansi() == 3 || responden1.getKatInstansi() == 6) {
            sumberdata1.print2();
            FormValidasiBlok3 formValidasiBlok3_SumberData = new FormValidasiBlok3();
            List<String> errors3 = formValidasiBlok3_SumberData.validateSumberData(sumberdata1);
            
            KepuasanData kepuasandata1 = new KepuasanData(1, 1, 1);
            kepuasandata1.print();
            FormValidasiBlok3 formValidasiBlok3_KepuasanData = new FormValidasiBlok3();
            List<String> errors4 = formValidasiBlok3_KepuasanData.validateKepuasanData(kepuasandata1);
            System.out.println("Pengisian Kuisioner Telah Selesai");
            } else {
              sumberdata1.print1();
              FormValidasiBlok3 formValidasiBlok3_SumberData = new FormValidasiBlok3();
              List<String> errors3 = formValidasiBlok3_SumberData.validateSumberData(sumberdata1);
              KepuasanData kepuasandata1 = new KepuasanData(1, 1, 1);
              kepuasandata1.print();
              FormValidasiBlok3 formValidasiBlok3_KepuasanData = new FormValidasiBlok3();
              List<String> errors4 = formValidasiBlok3_KepuasanData.validateKepuasanData(kepuasandata1);
              System.out.println("Pengisian Kuisioner Telah Selesai");
              }
            } 
    }
  }
}
