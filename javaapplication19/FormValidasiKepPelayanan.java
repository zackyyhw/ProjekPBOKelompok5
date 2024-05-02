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
import java.util.Map;

/**
 *
 * @author Dell
 */
class FormValidasiKepPelayanan {
    public List<String> validateKepPelayanan(KepuasanPelayanan kepuasanPelayanan) {
        ValidateTingkatKepuasanBlok2 validateKepuasan = new ValidateTingkatKepuasanBlok2();
        
        Map<Integer, String> errorMap = validateKepuasan.validate(kepuasanPelayanan);
        
        List<String> errors = new ArrayList<>();
        
        System.out.println("\n===============================================================================================================");
        System.out.println("                                        Validasi BLOK II");
        System.out.println("===============================================================================================================");
        
        if (errorMap.isEmpty()) {
            System.out.println("Data VALID");
        } else {
            System.out.println("Data INVALID, dengan kesalahan sebagai berikut:");
            for (Map.Entry<Integer, String> entry : errorMap.entrySet()) {
            String errorMessage = (errors.size() + 1) + ". Error pada pertanyaan nomor " + entry.getKey() + ": " + entry.getValue();
            System.out.println(errorMessage);
            errors.add(errorMessage);
        }

            System.out.println("\n");
        }

        return errors;
    }
}
