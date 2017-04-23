package javase01.t01.max;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** The class has static methods to create and traverse an array of real numbers.
 *
 * @author m-levin 23.04.17
 */

public class FindMax {
    public static void main(String[] args) {

        traverseArray(inputArray());

    }

    /** The method creates an array using integer number as its length, then fills the array with real numbers.
     *
     * 23.04.17
     * @return array with doubles
     */

    public static double[] inputArray() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] doubles;
        int arrayLength;
        try {
            System.out.println("Input n (gotta be > 0).");
            while (true) {
                arrayLength = Integer.parseInt(reader.readLine());
                if (arrayLength > 0)
                    break;
            }
            doubles = new double[2*arrayLength];
            for (int i = 0; i < doubles.length; ++i) {
                doubles[i] = Double.parseDouble(reader.readLine());
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Array input failure");
            doubles = new double[0];
        }

        return doubles;
    }

    /** On every iteration this method counts symmetric sum of two elements of the array and outputs the maximum sum.
     *  If the array contains only one number, it will be the output.
     *
     * @param doubles array of real numbers
     * 23.04.17
     */

    public static void traverseArray(double[] doubles) {
        double currentMax;
        if (doubles.length == 0) {
            System.out.println("Nothing to count");
            return;
        } else {
            currentMax = doubles[0] + doubles[doubles.length - 1];
            double tempVariable;
            for (int i = 1; i < doubles.length/2; i++) {
                tempVariable = doubles[i] + doubles[doubles.length - 1 - i];
                if (tempVariable > currentMax) {
                    currentMax = tempVariable;
                }
            }
            System.out.println("The answer is " + currentMax);
        }
    }
}
