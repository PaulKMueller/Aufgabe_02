package magicsquare;

/**
 * This class defines a MagicSquare different functions to interact with it.
 *
 * @author Paul
 * @version jdk-11.0.2
 */
public class MagicSquare {

    /**
     * The square on which the magic square is based. Represented by a 2-D array.
     */
    int[][] square;

    /**
     * Creates a MagicSquare for a given square.
     *
     * @param square The square array.
     */
    public MagicSquare(int[][] square) {
        setSquare(square);
    }

    /**
     * Shows all magic numbers from 1 to k.
     *
     * @param k Upper end for the magic numbers that are returned.
     * @return A String containing all the magic numbers from 1 to k.
     */
    public static String showMagicNumbers(int k) {
        StringBuilder ergebnis = new StringBuilder();
        int n = 1;
        int magicNumber;
        while (n <= k) {
            magicNumber = ((int) Math.pow(n, 3) + n) / 2;
            if (magicNumber == 1) {
                ergebnis.append(magicNumber);
            } else {
                ergebnis.append(",").append(magicNumber);
            }
            n++;
        }

        return ergebnis.toString();
    }

    /**
     * Calculates the complement square for a given square.
     *
     * @return The complement square.
     */
    public MagicSquare complement() {
        int[][] complementSquare = new int[square.length][square.length];
        for (int i = 0; i < square.length; i++) {
            for (int a = 0; a < square.length; a++) {
                complementSquare[i][a] = (square[i][a] * -1) + (int) Math.pow(square.length, 2) + 1;
            }
        }
        return new MagicSquare(complementSquare);
    }

    /**
     * @return The string representation of a given MagicSquare.
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int[] ints : getSquare()) {
            for (int a = 0; a < getSquare().length; a++) {
                result.append(" ").append(ints[a]);
            }
            result.append("\n");
        }
        return result.toString();
    }

    /**
     * @return Boolean value, that represents, whether the square is a magic square.
     */
    public boolean isMagicSquare() {
        int magicNumber = calculateColumn(0);
        boolean output = false;
        if (isSemiMagicSquare() && calculateDiagonal(0) == magicNumber && calculateDiagonal(1) == magicNumber) {
            output = true;
        }

        return output;
    }

    /**
     * @return Boolean value, that represents, whether the square is a semi-magic square.
     */
    public boolean isSemiMagicSquare() {
        int magicNumber = calculateColumn(0);
        boolean output = true;
        for (int i = 0; i < square.length; i++) {
            if (calculateColumn(i) != magicNumber || calculateRow(i) != magicNumber) {
                output = false;
            }
        }
        return output;

    }

    /**
     * Calculates the sum of the given column.
     *
     * @param coloumnIndex The given column index of the square.
     * @return The sum of all the numbers in the given column.
     */
    public int calculateColumn(int coloumnIndex) {
        int result = 0;
        for (int[] ints : square) {
            result += ints[coloumnIndex];
        }
        return result;
    }

    /**
     * Calculates the sum of the given row.
     *
     * @param rowIndex The given row index of the square.
     * @return The sum of all the numbers in the given row.
     */
    public int calculateRow(int rowIndex) {
        int result = 0;
        for (int i = 0; i < square.length; i++) {
            result += square[rowIndex][i];
        }
        return result;
    }

    /**
     * @param diagonalIndex The given diagonal index.
     *                      All even indices represent the diagonal (top-left, bottom right),
     *                      all uneven ones the diagonal (bottom-left, top-right).
     * @return The sum of the given diagonal.
     */
    public int calculateDiagonal(int diagonalIndex) {
        int result = 0;
        if (diagonalIndex % 2 == 0) {
            for (int i = 0; i < square.length; i++) {
                result += square[i][i];
            }
        } else if (diagonalIndex % 2 == 1) {
            int maxIndex = square.length - 1;
            for (int i = 0; i < square.length; i++) {
                result += square[maxIndex - i][i];
            }
        }
        return result;
    }

    /**
     * Returns the square array.
     *
     * @return The square array.
     */
    public int[][] getSquare() {
        return square;
    }

    /**
     * Sets the square attribute to the given square.
     *
     * @param square The square array.
     */
    public void setSquare(int[][] square) {
        this.square = square;
    }


}
