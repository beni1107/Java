/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.beni.javaoop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bendz
 */
public class JavaOOP {

    public static void main(String[] args) {
        String email ="bendy.ali@gmail.com";
         Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
         
         Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
         System.out.println(matcher.matches());
    }
}
