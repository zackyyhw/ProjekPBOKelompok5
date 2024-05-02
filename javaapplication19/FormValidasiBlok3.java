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
import java.util.List;

/**
 *
 * @author fiona
 */
public class FormValidasiBlok3 {
    public List<String> validateDataYangDibutuhkan(DataDibutuhkan datadibutuhkan) {
        ValidateJenisData validateJenisData = new ValidateJenisData();
        ValidateTahun validateTahunData= new ValidateTahun();
        ValidateLevelData validateLevelData = new ValidateLevelData();
        ValidatePeriodeData validatePeriodeData = new ValidatePeriodeData();
        ValidatePerolehanData validatePerolehanData = new ValidatePerolehanData();

        List<String> jenisDataErrors = validateJenisData.validate(datadibutuhkan);
        List<String> tahunDataErrors = validateTahunData.validate(datadibutuhkan);
        List<String> levelDataErrors = validateLevelData.validate(datadibutuhkan);
        List<String> periodeDataErrors = validatePeriodeData.validate(datadibutuhkan);
        List<String> perolehanDataErrors = validatePerolehanData.validate(datadibutuhkan);
 
        List<String> errors = new ArrayList<>();
        errors.addAll(jenisDataErrors);
        errors.addAll(tahunDataErrors);
        errors.addAll(levelDataErrors);
        errors.addAll(periodeDataErrors);
        errors.addAll(perolehanDataErrors );
        System.out.println("====================================================");
        System.out.println("            Validasi Data yang Dibutuhkan");
        System.out.println("====================================================");
         if (errors.isEmpty()) {
            System.out.println("Data Dibutuhkan VALID");
        } else {
            System.out.println("Data Dibutuhkan INVALID, dengan kesalahan sebagai berikut:");
            for (int i = 0; i < errors.size(); i++) {
        System.out.println((i + 1) + ". " + errors.get(i));
    }
        }

        return errors;
    }
    
    public List<String> validateSumberData(SumberData sumberdata) {
    ValidateJenisSumberData validateJenisSumberData = new ValidateJenisSumberData();
    ValidateJudulSumberData validateJudulSumberData = new ValidateJudulSumberData();
    ValidatePenggunaanData validatePenggunaanData = new ValidatePenggunaanData();
    
    List<String> jenisSumberDataErrors = validateJenisSumberData.validate(sumberdata);
    List<String> judulSumberDataErrors = validateJudulSumberData.validate(sumberdata);
    List<String> penggunaaDataErrors = validatePenggunaanData.validate(sumberdata);
    
     List<String> errors = new ArrayList<>();
     errors.addAll(jenisSumberDataErrors);
     errors.addAll(judulSumberDataErrors);
     errors.addAll(penggunaaDataErrors);
     System.out.println("===========================================================");
     System.out.println("                   Validasi Sumber Data");
     System.out.println("===========================================================");
        if (errors.isEmpty()) {
            System.out.println("Sumber Data VALID");
        } else {
            System.out.println("Sumber Data INVALID, dengan kesalahan sebagai berikut:");
            for (int i = 0; i < errors.size(); i++) {
        System.out.println((i + 1) + ". " + errors.get(i));
    }
        }

        return errors;
    }
    
    public List<String> validateKepuasanData(KepuasanData kepuasandata) {
        ValidateTingkatKepuasanBlok3 validateTingkatKepuasan = new ValidateTingkatKepuasanBlok3();
        
        List<String> tingkatKepuasanErrors = validateTingkatKepuasan.validate(kepuasandata);
        
        List<String> errors = new ArrayList<>();
        errors.addAll(tingkatKepuasanErrors);
        System.out.println("====================================================");
        System.out.println("           Validasi Kepuasan Data");
        System.out.println("====================================================");
        if (errors.isEmpty()) {
            System.out.println("Kepuasan Data VALID");
        } else {
            System.out.println("Kepuasan Data INVALID, dengan kesalahan sebagai berikut:");
            for (int i = 0; i < errors.size(); i++) {
        System.out.println((i + 1) + ". " + errors.get(i));
    }
        }

        return errors;
    }
        
}

