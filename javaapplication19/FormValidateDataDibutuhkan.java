/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

package javaapplication19;

import java.util.List;

public interface FormValidateDataDibutuhkan {

    public <T extends DataDibutuhkan> List<String> validate(T input);
 }