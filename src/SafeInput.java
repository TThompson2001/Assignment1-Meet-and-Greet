import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Wulft
 */
public class SafeInput {
    public boolean getString(String personal ) {
        boolean perLength = true;
        if(personal.length() < 25){
             perLength = false;
        }

        return perLength;
    }

    public static ArrayList<String> getArrayOfStrings(Scanner scanner, String prompt) {
        ArrayList<String> retval = new ArrayList<>();
        // add Implementation here ⬇

        return retval;
    }


    // Extra Credit Email Validation
    private Matcher matcher;
    public boolean getEmail(String email){
        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        matcher = pattern.matcher(email);
        return matcher.matches();
        }

    }


