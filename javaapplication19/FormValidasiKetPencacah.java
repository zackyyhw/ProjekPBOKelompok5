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
 * @author Dell
 */
import java.util.List;
import java.util.ArrayList;

public class FormValidasiKetPencacah {
    public List<String> validateKetPencacah(KetPencacah pencacah) {
        ValidasiNama validateNama = new ValidasiNama();
        ValidasiTanggal validateTanggal = new ValidasiTanggal();
        ValidasiNoResponden validateNoResponden = new ValidasiNoResponden();
        
        List<String> namaErrors = validateNama.validate(pencacah);
        List<String> tanggalErrors = validateTanggal.validate(pencacah);
        List<String> noRespondenErrors = validateNoResponden.validate(pencacah);
        
        List<String> errors = new ArrayList<>();
        errors.addAll(namaErrors);
        errors.addAll(tanggalErrors);
        errors.addAll(noRespondenErrors);
        
        System.out.println("=================================================================================");
        System.out.println("                          Validasi Keterangan Pencacah");
        System.out.println("=================================================================================");
         if (errors.isEmpty()) {
            System.out.println("Data VALID");
        } else {
            System.out.println("Data INVALID, dengan kesalahan sebagai berikut:");
            for (int i = 0; i < errors.size(); i++) {
        System.out.println((i + 1) + ". " + errors.get(i));
        }
        System.out.println("\n");
        }

        return errors;
    }
}