/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.cellphonenumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jufeq
 */
public class CellPhoneNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        List<String> validNumbers = new ArrayList<>();
        List<String> invalidNumbers = new ArrayList<>();

        numbers.add("312-456-7890");
        numbers.add("(310) 987 6543");
        numbers.add("+57 3019876543");
        numbers.add("350.a23.5678");
        numbers.add("301765432");
        numbers.add("3223345566");
        numbers.add("3009988776");

        // \b3\d{9}\b
        Pattern pattern = Pattern.compile("\\b3\\d{9}\\b");

        for (String number : numbers) {
            String numberWithOutSpecialCharacters
                    = number.replaceAll("[^0-9]", "");

            Matcher match
                    = pattern.matcher(numberWithOutSpecialCharacters);

            if (match.find()) {
                validNumbers.add(numberWithOutSpecialCharacters);
                System.out.println(numberWithOutSpecialCharacters);
            } else {
                invalidNumbers.add(number);
            }
        }

        System.out.println("Valid numbers with bigining with number 3: " + validNumbers.size());
        System.out.println("Invalid numbers with out bigining with number 3: " + invalidNumbers.size());
    }

}
