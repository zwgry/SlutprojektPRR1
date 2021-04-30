/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathias
 */
public class PasswordFormatExeption extends java.lang.Exception{
    
    String message;

    public PasswordFormatExeption() {
        message = "Lösenordet måste inehålla en siffra";
    }

    public String getMessage() {
        return message;
    }
}
