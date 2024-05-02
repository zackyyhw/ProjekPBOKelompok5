/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateTingkatKepuasanBlok2 {
    public Map<Integer, String> validate(KepuasanPelayanan input) {
        Map<Integer, String> errorMap = new HashMap<>();

        // Validate the array lengths
        if (input.getKepentingan().length != input.getKepuasan().length) {
            errorMap.put(-1, "Invalid data. Array kepentingan and kepuasan harus memiliki panjang yang sama.");
            return errorMap;
        }

        // Validate the values
        for (int i = 0; i < input.getKepentingan().length; i++) {
            if (!isValidValue(input.getKepentingan()[i])) {
                errorMap.put(i, "Terdapat nilai kepentingan yang invalid. Input harus berupa integer antara 1 sampai 10.");
            }
            if (!isValidValue(input.getKepuasan()[i])) {
                errorMap.put(i, "Terdapat nilai kepuasan yang invalid. Input harus berupa integer antara 1 sampai 10.");
            }
        }

        return errorMap;
    }

    private boolean isValidValue(int value) {
        return value >= 1 && value <= 10;
    }
}
