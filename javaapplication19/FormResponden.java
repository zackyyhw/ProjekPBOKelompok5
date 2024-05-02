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
import java.util.ArrayList;
import java.util.List;

public class FormResponden extends Form {
    @Override
    public <T extends Responden> List<String> validate(FormValidate validateTipe, T input){
        List<String> errorList = new ArrayList<String>();
        errorList = validateTipe.validate(input);
        if(!errorList.isEmpty()){
            for (String error : errorList){
                super.addErrorMessages(error);
            }
        }
        return super.getErrorMessages();
    }
}
