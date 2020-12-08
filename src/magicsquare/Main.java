package magicsquare;

import java.util.ArrayList;

/**
 * This class specifies a programm that makes it possible to invoke different methods on a MagicSquare.
 * @author Paul
 * @version jdk-11.0.2
 */
public class Main {

    /**The main method.
     * @param args The arguments for the main method.
     */
    public static void main(String[] args) {

        switch (args[0]) {
            case "showMagicNumbers":
                System.out.println(MagicSquare.showMagicNumbers(Integer.parseInt(args[1])));
                break;
            case "isMagicSquare?": {
                MagicSquare square = new MagicSquare(stringToSquare(args[1]));
                System.out.println(square.toString());
                if (square.isMagicSquare()) {
                    System.out.println("magic square");
                } else {
                    System.out.println("not magical");
                }
                break;
            }
            case "complement": {
                MagicSquare square = new MagicSquare(stringToSquare(args[1]));
                System.out.println(square.complement().toString());
                break;
            }
            default:
                break;
        }

    }

    /**
     *Takes the string representation of a square, and returns a square in the form of a two dimensional integer array.
     * @param stringSquare The string representation of a square.
     * @return A square in the form of a two dimensional integer array.
     */
    public static int[][] stringToSquare(String stringSquare ) {
        ArrayList<String> rawString = new ArrayList<>();
        StringBuilder newNumber = new StringBuilder();
        char [] stringArray = stringSquare.toCharArray();
        for (char c : stringArray) {
            switch (c) {
                case ',':
                case ';':
                    rawString.add(newNumber.toString());
                    newNumber = new StringBuilder();
                    break;
                default:
                    newNumber.append(c);
                    break;
            }
        }
        rawString.add(newNumber.toString());
        int squareLength = (int) Math.sqrt(rawString.size());
        int[][] square = new int[squareLength][squareLength];
        System.out.println(rawString);

        int zaehler = 0;
        for (int i = 0; i < squareLength; i++) {
            for (int a = 0; a < squareLength; a++) {
                square[i][a] = Integer.parseInt(String.valueOf(rawString.get(zaehler)));
                zaehler++;
            }
        }

        return square;
    }
}
