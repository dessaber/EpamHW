package javase01.t01.max;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by m-levin on 23.04.2017.
 */

public class FindMax {
    public static void main(String[] args) {

        traverseArray(inputArray());

    }

    public static double[] inputArray() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] doubles;
        int arrayLength;
        try {
            System.out.println("Input amount of real numbers first (gotta be > 0).");
            while (true) {
                arrayLength = Integer.parseInt(reader.readLine());
                if (arrayLength > 0 && arrayLength < Integer.MAX_VALUE)
                    break;
            }
            doubles = new double[arrayLength];
            for (int i = 0; i < arrayLength; ++i) {
                doubles[i] = Double.parseDouble(reader.readLine());
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Array input failure");
            doubles = new double[0];
        }

        return doubles;
    }

    public static void traverseArray(double[] doubles) {
        double currentMax;
        if (doubles.length == 0) {
            System.out.println("Nothing to count");
            return;
        } else if (doubles.length == 1)
            System.out.println("The answer is " + doubles[0]);
        else {
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
