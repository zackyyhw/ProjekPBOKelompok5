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

/**
 *
 * @author fiona
 */
import java.util.List;
import java.util.ArrayList;

public class FormValidasiBlok1 {
    public List<String> validateResponden(Responden responden) {
        ValidateTahun validateTahun = new ValidateTahun();
        ValidatePekerjaan validatePekerjaan = new ValidatePekerjaan();
        ValidateKategoriInstansi validateKategoriInstansi = new ValidateKategoriInstansi();
        ValidatePemanfaatan validatePemanfaatan = new ValidatePemanfaatan();
        ValidateFasilitas validateFasilitas = new ValidateFasilitas();
        ValidateJenisLayanan validateJenisLayanan = new ValidateJenisLayanan();
        ValidateJenisKelamin validateJenisKelamin = new ValidateJenisKelamin();
        ValidateDataRujukan validateDataRujukan = new ValidateDataRujukan();
        ValidatePengaduanPST validatePengaduanPST = new ValidatePengaduanPST();
        ValidasiNama validateNama = new ValidasiNama();
        ValidateEmail validateEmail = new ValidateEmail();
        ValidateNomorHp validateNomorHp = new ValidateNomorHp();
        ValidatePendidikan validatePendidikan = new ValidatePendidikan();

        List<String> tahunErrors = validateTahun.validate(responden);
        List<String> pekerjaanErrors = validatePekerjaan.validate(responden);
        List<String> kategoriInstansiErrors = validateKategoriInstansi.validate(responden);
        List<String> pemanfaatanErrors = validatePemanfaatan.validate(responden);
        List<String> fasilitasErrors = validateFasilitas.validate(responden);
        List<String> jenisLayananErrors = validateJenisLayanan.validate(responden);
        List<String> jenisKelaminErrors = validateJenisKelamin.validate(responden);
        List<String> dataRujukanErrors = validateDataRujukan.validate(responden);
        List<String> pengaduanPSTErrors = validatePengaduanPST.validate(responden);
        List<String> namaErrors = validateNama.validate(responden);
        List<String> emailError = validateEmail.validate(responden);
        List<String> nomorHpError = validateNomorHp.validate(responden);
        List<String> pendidikanError = validatePendidikan.validate(responden);

        List<String> errors = new ArrayList<>();
        errors.addAll(tahunErrors);
        errors.addAll(pekerjaanErrors);
        errors.addAll(kategoriInstansiErrors);
        errors.addAll(pemanfaatanErrors);
        errors.addAll(fasilitasErrors);
        errors.addAll(jenisLayananErrors);
        errors.addAll(jenisKelaminErrors);
        errors.addAll(dataRujukanErrors);
        errors.addAll(pengaduanPSTErrors);
        errors.addAll(namaErrors);
        errors.addAll(emailError);
        errors.addAll(nomorHpError);
        errors.addAll(pendidikanError);
        
        System.out.println("====================================================");
        System.out.println("                 Validasi BLOK I");
        System.out.println("====================================================");
         if (errors.isEmpty()) {
            System.out.println("Data VALID");
        } else {
            System.out.println("Data INVALID, dengan kesalahan sebagai berikut:");
            for (int i = 0; i < errors.size(); i++) {
        System.out.println((i + 1) + ". " + errors.get(i));
    }
        }

        return errors;
    }
}

