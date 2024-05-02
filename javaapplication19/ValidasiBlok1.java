/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ValidateTahun implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input) {
        List<String> errorList = new ArrayList<>();
        int currentYear = java.time.Year.now().getValue();

        if (input.getTahunLahir() < 1900 || input.getTahunLahir() > currentYear) {
            errorList.add("Tahun tidak valid");
        }
        
        
        return errorList;
    }
    
    public <T extends DataDibutuhkan> List<String> validate(T input) {
        List<String> errorList = new ArrayList<>();
        int currentYear = java.time.Year.now().getValue();

        if (input.getTahunData() < 1900 || input.getTahunData() > currentYear) {
            errorList.add("Tahun tidak valid");
        }

        
        return errorList;
    }
}

class ValidatePekerjaan implements FormValidate {

    private List<String> errorList = new ArrayList<>();

    @Override
    public <T extends Responden> List<String> validate(T input) {
        errorList.clear(); // Clear any previous errors

        if (input.getPekerjaan() < 1 || input.getPekerjaan() > 7) {
            errorList.add("Kode pekerjaan harus berupa angka 1 sampai 7");
        } else if (input.getPekerjaan() == 7) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan pekerjaan Anda: ");
            String answer = scanner.nextLine().trim();
            if (answer.isEmpty()) {
                errorList.add("Kode pekerjaan tidak boleh kosong");
            }
        }
        
        return errorList;
    }
}


class ValidateKategoriInstansi implements FormValidate{
    private List<String> errorList = new ArrayList<>();

    @Override
    public <T extends Responden> List<String> validate(T input) {
        List<String> errorList = new ArrayList<>();

        if (input.getKatInstansi() < 1 || input.getKatInstansi() > 10) {
            errorList.add("Kode kategori instansi harus berupa angka 1 sampai 10");
        } else if (input.getKatInstansi() == 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan kategori instansi Anda: ");
            String answer = scanner.nextLine().trim();
            if (answer.isEmpty()) {
                errorList.add("Kode kategori Instansi tidak boleh kosong");
            }  
    }
      
        return errorList;
}
}

class ValidatePemanfaatan implements FormValidate {
    private List<String> errorList = new ArrayList<>();

    @Override
    public <T extends Responden> List<String> validate(T input) {
        List<String> errorList = new ArrayList<>();

        if (input.getPemanfaatan() < 1 || input.getPemanfaatan() > 5) {
            errorList.add("Kode akses layanan harus berupa angka 1 sampai 5");
        } else if (input.getPemanfaatan() == 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ketikkan Tujuan penggunaan data Anda: ");
            String answer = scanner.nextLine().trim();
            if (answer.isEmpty()) {
                errorList.add("Kode akses layanan tidak boleh kosong");
            }
    }
        
         return errorList;
}
}

class ValidateFasilitas implements FormValidate {
    private List<String> errorList = new ArrayList<>();

    @Override
    public <T extends Responden> List<String> validate(T input)  {
        List<String> errorList = new ArrayList<>();

        if (input.getFasilitas() != 1 && input.getFasilitas() != 2 && input.getFasilitas() != 4 && input.getFasilitas() != 8 && input.getFasilitas() != 16) {
            errorList.add("Kode jenis fasilitas harus berupa angka 1/2/4/8/16");
        } else if (input.getFasilitas() == 16) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Tuliskan fasilitas BPS yang Anda gunakan untuk memperoleh data: ");
            String answer = scanner.nextLine().trim();
            if (answer.isEmpty()) {
                errorList.add("Kode jenis fasilitas tidak boleh kosong");
            }
        }
   
        
        return errorList;
}
}

class ValidateJenisLayanan implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        
        // Validasi untuk angka spesifik
        int jenisLayanan = input.getJenisLayanan(); // Mengambil nilai angka spesifik dari objek input
        if(!(jenisLayanan == 1 || jenisLayanan == 2 || jenisLayanan == 4 || jenisLayanan == 8 || jenisLayanan == 16 || jenisLayanan == 32)) {
            errorList.add("Angka harus salah satu dari 1, 2, 4, 8, 16, atau 32");
        }
         
        return errorList;
    }
}

class ValidateJenisKelamin implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        
        // Validasi untuk jenis kelamin (jk)
        int jenisKelamin = input.getJk(); // Mengambil nilai jenis kelamin dari objek input
        if(jenisKelamin != 1 && jenisKelamin != 2) {
            errorList.add("Jenis kelamin harus bernilai 1 atau 2");
        }
        
        return errorList;
 }}
    
 class ValidateDataRujukan implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();

        // Validasi untuk pertanyaan dengan jawaban ya atau tidak
        int dataRujukan = input.getDataRujukan(); // Mengambil nilai pertanyaan dari objek input
        if(dataRujukan != 1 && dataRujukan != 2) {
            errorList.add("Pertanyaan harus dijawab dengan ya atau tidak (nilai 1 atau 2)");
        }
        
        return errorList;
    }
}
        
   class ValidatePengaduanPST implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        
        int pengaduanPST = input.getPengaduanPST(); // Mengambil nilai pertanyaan dari objek input
        if(pengaduanPST != 1 && pengaduanPST != 2) {
            errorList.add("Pertanyaan harus dijawab dengan ya atau tidak (nilai 1 atau 2)");
        }
       
        return errorList;
    }
}
    
class ValidateNomorHp implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        if(!(input.getNomorHp().matches("^(\\+62|0)[0-9]{10,13}$"))){
             errorList.add("Nomor telepon berformat +62xxxxxxxxxxx atau 08xxxxxxxxxx dan terdiri dari 10 sampai 13 angka");
        }
       
        return errorList;
    }
}

class ValidateEmail implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        if(!(input.getEmail().matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"))){
             errorList.add("Format email tidak valid");
        }
    
        
        return errorList;
    }
}

class ValidatePendidikan implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        
        // Validasi untuk tingkat pendidikan
        int pendidikan = input.getPendidikan(); // Mengambil nilai tingkat pendidikan dari objek input
        if(pendidikan < 1 || pendidikan > 5) {
            errorList.add("Tingkat pendidikan harus berada di antara 1 hingga 5");
        }

        return errorList;
    }
}



