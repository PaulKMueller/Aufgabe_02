package iban;

import java.math.BigInteger;

/**
 * This class calculates the IBAN based on country code, account number and bank number
 * @author Paul
 * @version jdk-11.0.2
 */

public class IbanCalculator {

    /**
     * Initialising the variables in the arguments (countryCode, bankNumber and accountNumber)
     * @param args arguments passed into the main method
     */

    public static void main(String[] args) {

        String countryCode = args[0];
        BigInteger bankNumber = new BigInteger(args[1]);
        BigInteger accountNumber = new BigInteger(args[2]);

        String newBankNumber = bankNumber.toString();
        System.out.println(newBankNumber);
        String newAccountNumber = toTenDigits(accountNumber);
        System.out.println(newAccountNumber);

        String lastIbanPart = bankNumber.toString() + newAccountNumber;
        String checkNumber = countryCodeToCheckNumber(lastIbanPart, countryCode);
        String iban = makeIban(countryCode, checkNumber, newBankNumber, newAccountNumber);
        System.out.println(iban);
    }

    /**
     * Add zeros to a number until it is 10 digits long.
     * @param number Any number of the BigInteger type
     * @return newNumber (number filled with leading zeros)
     */

    public static String toTenDigits(BigInteger number) {

        StringBuilder newNumber = new StringBuilder(number.toString());
        while (newNumber.length() < 10) {
            newNumber.insert(0, "0");
        }

        return newNumber.toString();
    }

    /**
     * This method calculates the check number based on the given country code.
     * @param bankAndAccount The concatenated bank and (new) account number.
     * @param code This is the country code on which the calculation is based.
     * @return checkNumber A two digit number based on the country code.
     */

    public static String countryCodeToCheckNumber(String bankAndAccount, String code) {
        char firstLetter = code.toCharArray()[0];
        char secondLetter = code.toCharArray()[1];
        int asciiTransformer = 64;
        BigInteger moduloTransformer = BigInteger.valueOf(97);
        int nintyEight = 98;
        String firstNumber = String.valueOf(firstLetter - asciiTransformer + 9);
        String secondNumber = String.valueOf(secondLetter - asciiTransformer + 9);
        String result = bankAndAccount + firstNumber + secondNumber + "00";

        int newResult = new BigInteger(result).mod(moduloTransformer).intValue();
        newResult = nintyEight - newResult;
        String finalResult;
        if (newResult < 10) {
            finalResult = "0" + newResult;
        } else {
            finalResult = String.valueOf(newResult);
        }

        return finalResult;
    }

    /**
     *
     * @param countryCode The iban's country code.
     * @param checkNumber The check number calculated in "countryCodeToCheckNumber".
     * @param bankNumber The iban's bank number.
     * @param accountNumber The iban's account number, brought to ten digits.
     * @return A formatted iban.
     */

    public static String makeIban(String countryCode, String checkNumber, String bankNumber, String accountNumber) {
        String iban = countryCode + checkNumber + bankNumber + accountNumber;
        char[] ibanArray = iban.toCharArray();
        StringBuilder result = new StringBuilder(22);
        for (int i = 0; i < ibanArray.length; i++) {
            switch(i) {
                case 3:
                case 7:
                case 11:
                case 15:
                case 19:
                    result.append(ibanArray[i]).append(" ");
                    break;
                default:
                    result.append(ibanArray[i]);
                    break;

            }
        }
        return result.toString();
    }
}
