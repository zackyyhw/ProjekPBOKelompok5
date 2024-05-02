/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KetPencacah {
    private String namaPencacah;
    private Date tanggalPencacahan; // Ubah tipe data menjadi Date
    private String namaPemeriksa;
    private Date tanggalPemeriksaan; // Ubah tipe data menjadi Date
    private int noResponden;
    private Responden responden;
    //responden[] dibuat terpisah jadi ntar gabunginnya pas udah jadi semua

    public KetPencacah(String namaPencacah, String tanggalPencacahan, String namaPemeriksa, String tanggalPemeriksaan, int noResponden){
        this.namaPencacah = namaPencacah;
        this.tanggalPencacahan = convertStringToDate(tanggalPencacahan);
        this.namaPemeriksa = namaPemeriksa;
        this.tanggalPemeriksaan = convertStringToDate(tanggalPemeriksaan);
        this.noResponden = noResponden;
    }

    public void setnamaPencacah (String namaPencacah){
        this.namaPencacah = namaPencacah;
    }

    // Metode setter untuk tanggal pencacahan
    public void setTanggalPencacahan(String tanggalPencacahan) {
        // Konversi String ke Date menggunakan SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.tanggalPencacahan = dateFormat.parse(tanggalPencacahan);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void setnamaPemeriksa (String namaPemeriksa) {
        this.namaPemeriksa = namaPemeriksa;
    }

    // Metode setter untuk tanggal pemeriksaan
    public void setTanggalPemeriksa(String tanggalPemeriksaan) {
        // Konversi String ke Date menggunakan SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.tanggalPemeriksaan = dateFormat.parse(tanggalPemeriksaan);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setnoResponden (int noResponden) {
        this.noResponden = noResponden;
    }

    public String getnamaPencacah() {
        return this.namaPencacah;
    }   

    public Date gettanggalPencacahan() {
        return this.tanggalPencacahan;
    }
    
    public String getnamaPemeriksa(){
        return this.namaPemeriksa;
    }

    public Date gettanggalPemeriksaan(){
        return this.tanggalPemeriksaan;
    }

    public int getnoResponden(){
        return this.noResponden;
    }

    public void print() {
        System.out.println("==================================================");
        System.out.println("              ISIAN KETERANGAN PENCACAH");
        System.out.println("==================================================");
        System.out.println("Nama Pencacah       : " + namaPencacah);
        System.out.println("Tanggal Pencacahan  : " + tanggalPencacahan);
        System.out.println("Nama Pemeriksa      : " + namaPemeriksa);
        System.out.println("Tanggal Pemeriksaan : " + tanggalPemeriksaan);
        System.out.println("Nomor Responden     : " + noResponden+"\n");
    }
    
    // Metode untuk mengonversi String menjadi Date
    private Date convertStringToDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
