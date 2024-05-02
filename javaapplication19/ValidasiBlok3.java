/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ValidateNoData {
    public List<String> validate(DataDibutuhkan input){
        List<String> errorList = new ArrayList<String>();

        if(input.getNoData() <= 0) {
            errorList.add("Nomor data harus lebih besar dari 0.");
    }

    return errorList;
    }
}

class ValidateTahunData implements FormValidateDataDibutuhkan {
    public <T extends DataDibutuhkan> List<String> validate(T input) {
        List<String> errorList = new ArrayList<>();
        int currentYear = java.time.Year.now().getValue();

        if (input.getTahunData() < 1900 || input.getTahunData() > currentYear) {
            errorList.add("Tahun tidak valid");
        }

        
        return errorList;
    }    
}

class ValidateLevelData implements FormValidateDataDibutuhkan {
   public List<String> validate(DataDibutuhkan input) {
        List<String> errorList = new ArrayList<String>();

        if (input.getLevelData() < 1 || input.getLevelData() > 7) {
            errorList.add("Level Data harus berupa angka 1 sampai 7");
        } else if (input.getLevelData() == 7) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ketikkan Level Data yang Dibutuhkan/Dikonsultasikan: ");
            String answer = scanner.nextLine().trim();
            if (answer.isEmpty()) {
                errorList.add("Level Data tidak boleh kosong");
            }
    }
        return errorList;
    }
}

class ValidateJenisData implements FormValidateDataDibutuhkan {
        public List<String> validate(DataDibutuhkan input) {
        List<String> errorList = new ArrayList<String>();

        if(input.getJenisData().isEmpty()) {
            errorList.add("Jenis Data Tidak Boleh Kosong");
        }

        return errorList;
    }
}

class ValidatePeriodeData implements FormValidateDataDibutuhkan {
    public List<String> validate(DataDibutuhkan input) {
        List<String> errorList = new ArrayList<String>();

        if (input.getPeriodeData() < 1 || input.getPeriodeData() > 10) {
            errorList.add("Periode Data harus berupa angka 1 sampai 10");
        } else if (input.getPeriodeData() == 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ketikkan Periode Data yang Dibutuhkan/Dikonsultasikan: ");
            String answer = scanner.nextLine().trim();
            if (answer.isEmpty()) {
                errorList.add("Periode Data tidak boleh kosong");
            }
    }
        return errorList;
    }
}
    
class ValidatePerolehanData implements FormValidateDataDibutuhkan{
        public List<String> validate(DataDibutuhkan input){
        List<String> errorList = new ArrayList<String>();

        //Validasi untuk PerolehanData
        int perolehanData = input.getPerolehanData();
        if(!perolehanDataValid(perolehanData)) {
            errorList.add("Jawaban tidak valid (hanya dapat diisi dengan angka 1 sampai 4.)");
        }

        return errorList; }

        //Method untuk memeriksa apakah nilai perolehan data yang diberikan oleh pengguna valid atau tidak.
        private boolean perolehanDataValid(int perolehanData) {
            return perolehanData >= 1 && perolehanData <= 4;
        } 
}

class ValidateJenisSumberData implements FormValidateSumberData{
    public List<String> validate(DataDibutuhkan input) {
        List<String> errorList = new ArrayList<String>();

        //Memeriksa apakah data sudah diperoleh ( (Kolom (6:perolehanData) berkode 1 atau 2))
        int perolehanData = input.getPerolehanData();
        if(perolehanData != 1 && perolehanData != 2) {
            //Jika data belum diperoleh, keluar dari validasi
        }
        return errorList;
    }
    
    public List<String> validate(SumberData input) {
        List<String> errorList = new ArrayList<String>();
        //Validasi Jenis Sumber Data
        int jenisSumber = input.getjenisSumber();
        if(!jenisSumberValid(jenisSumber)) {
            errorList.add("Jenis Sumber Data Tidak Valid");
        }
        return errorList;
    }
        //Method untuk memeriksa apakah jenis sumber data valid
        private boolean jenisSumberValid(int jenisSumber) {
            return (jenisSumber >= 1 && jenisSumber <= 5);
        }
}

class ValidateJudulSumberData implements FormValidateSumberData{
    public List<String> validate(SumberData input) {
        List<String> errorList = new ArrayList<String>();

        //Memeriksa apakah data sudah diperoleh ( (Kolom (6:perolehanData) berkode 1 atau 2))
        int perolehanData = input.getPerolehanData();
        if(perolehanData != 1 && perolehanData != 2) {
            //Jika data belum diperoleh, keluar dari validasi
            return errorList;
        }

        //Periksa validitas Judul Sumber Data
        String judulSumber = input.getjudulSumber();
        if(!judulSumberDataValid(judulSumber)){
            errorList.add("Judul sumber data tidak boleh kosong");
        }
        
        return errorList;
    }
    
        // Metode untuk memeriksa apakah judul sumber data valid
        private boolean judulSumberDataValid(String judulSumber){
            // Valid jika judul sumber tidak kosong dan tidak null
            return (judulSumber != null && !judulSumber.isEmpty());
        }
}

class ValidateTahunSumberData implements FormValidateSumberData{
    public <T extends SumberData> List<String> validate(T input) {
        List<String> errorList = new ArrayList<>();
        int currentYear = java.time.Year.now().getValue();

        if (input.gettahunSumber() < 1900 || input.gettahunSumber() > currentYear) {
            errorList.add("Tahun tidak valid");
        }
        return errorList;
    }
}

class ValidatePenggunaanData implements FormValidateSumberData {
 

    public <T extends SumberData> List<String> validate(T input) {
        List<String> errorList = new ArrayList<String>();

            // Periksa apakah penggunaan data berisi 1 atau 2
            int penggunaanData = input.getpenggunaanData();
            if (!penggunaanDataValid(penggunaanData)) {
                errorList.add("Penggunaan data hanya dapat diisi dengan angka 1 atau 2.");
            }
 
        return errorList; }

    // Metode untuk memeriksa apakah penggunaan data valid
    private boolean penggunaanDataValid(int penggunaanData) {
        return (penggunaanData == 1 || penggunaanData == 2);
    }}


class ValidateTingkatKepuasanBlok3 implements FormValidateKepuasanData{
    @Override
    public <T extends KepuasanData> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        
        // Validasi untuk kelengkapanData
        int kelengkapanData = input.getKelengkapanData(); // Mengambil nilai tingkat pendidikan dari objek input
        if(kelengkapanData < 1 || kelengkapanData > 10) {
            errorList.add("Tingkat pendidikan harus berada di antara 1 hingga 10");
        }
        
        //Validasi untuk akurasiData
        int akurasiData = input.getAkurasiData(); // Mengambil nilai tingkat pendidikan dari objek input
        if(akurasiData < 1 || akurasiData > 10) {
            errorList.add("Tingkat pendidikan harus berada di antara 1 hingga 10");
        }
        
        //Validasi untuk kemutakhiranData
        int kemutakhiranData = input.getKemutakhiranData(); // Mengambil nilai tingkat pendidikan dari objek input
        if(kemutakhiranData < 1 || kemutakhiranData > 10) {
            errorList.add("Tingkat pendidikan harus berada di antara 1 hingga 10");
        }
        return errorList;
    }
}