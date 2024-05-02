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

public class ValidasiNama implements FormValidate {
    @Override
    public <T extends Responden> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        
        if (input.getNamaResponden().isEmpty()){
           errorList.add("Nama Responden Harus di isi");
        } 
        
        
//        if (!input.getNama().matches("[a-zA-Z0-9]+")){
//            System.out.println(input.getNama());
//            errorList.add("Nama Mengandung Simbol Karakter yang Tidak Diperbolehkan");
//        }
        
        if (input.getNamaInstansi().isEmpty()){
           errorList.add("Nama Instansi Harus di isi");
        }
//        if (!input.getNama().matches("[a-zA-Z0-9]+")){
//            System.out.println(input.getNama());
//            errorList.add("Nama Mengandung Simbol Karakter yang Tidak Diperbolehkan");
//        }

 
         return errorList;
    }
   
    
    public <T extends KetPencacah> List<String> validate(T input){
        List<String> errorList = new ArrayList<String>();
        if (input.getnamaPemeriksa().isEmpty()){
                   errorList.add("Nama Pemeriksa Harus di isi");
                }
        //        if (!input.getNama().matches("[a-zA-Z0-9]+")){
        //            System.out.println(input.getNama());
        //            errorList.add("Nama Mengandung Simbol Karakter yang Tidak Diperbolehkan");
        //        }
        
        if (input.getnamaPencacah().isEmpty()){
           errorList.add("Nama Pencacah Harus di isi");
        }
//        if (!input.getNama().matches("[a-zA-Z0-9]+")){
//            System.out.println(input.getNama());
//            errorList.add("Nama Mengandung Simbol Karakter yang Tidak Diperbolehkan");
//        }

        return errorList;
    }
}