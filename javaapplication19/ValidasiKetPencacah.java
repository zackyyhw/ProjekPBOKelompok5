/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class ValidasiTanggal {
   // Metode untuk memvalidasi tanggal agar tidak melebihi hari ini
    public static boolean isValidDate(Date date) {
        // Mendapatkan tanggal hari ini
        Date today = new Date();

        // Memeriksa apakah tanggal input lebih kecil atau sama dengan hari ini
        return !date.after(today);
    }
    
    // Metode untuk memvalidasi tanggal pada objek KetPencacah
    public static List<String> validate(KetPencacah pencacah) {
        List<String> errorList = new ArrayList<>();
        
        // Mengambil tanggal pencacahan dan tanggal pemeriksaan dari objek KetPencacah
        Date tanggalPencacahan = pencacah.gettanggalPencacahan();
        Date tanggalPemeriksaan = pencacah.gettanggalPemeriksaan();
        
        // Memvalidasi tanggal pencacahan
        if (!isValidDate(tanggalPencacahan)) {
            errorList.add("Tanggal pencacahan melewati hari ini.");
        }
        
        // Memvalidasi tanggal pemeriksaan
        if (!isValidDate(tanggalPemeriksaan)) {
            errorList.add("Tanggal pemeriksaan melewati hari ini.");
        }
        return errorList;
    }
}

class ValidasiNoResponden {
    public <T extends KetPencacah> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        
        // Validasi untuk angka spesifik
        int noResponden = input.getnoResponden(); // Mengambil nilai angka spesifik dari objek input
        String noRespondenStr = String.valueOf(noResponden);
        if(noRespondenStr.length()!=7) {
            errorList.add("no Responden Harus Terdiri dari 7 digit(4 digit kode wilayah, 3 digit no Urut)");
        }

        return errorList;
    }
}