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
public abstract class Form {

    private List<String> errorMessages = new ArrayList<String>();
    private FormValidate validateTipe;

    public abstract <T extends Responden> List<String> validate(FormValidate validateTipe, T input);

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    protected void addErrorMessages(String message) {
        this.errorMessages.add(message);
    }
}
