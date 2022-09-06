package assignments.java_programming;

import java.util.Scanner;

class Assignment {
    public static void main(String[] args) {

        /*STEPS:
         * 
         * 1. Declare variable
         * 2. Ask user for input
         * 3. Accept input
         * 4. give output
         */
        int numberOfrows, numberOfcolumns;
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        numberOfrows = takeInput.nextInt();
        System.out.print("Input number of column: ");
        numberOfcolumns = takeInput.nextInt();

        int bigArray[][] = new int[numberOfrows][numberOfcolumns];

        for (int row = 0; row < bigArray.length; row++) {
            for (int column = 0; column < bigArray[row].length; column++) {
                if (column == bigArray[row].length - 1) {
                    System.out.println("*");
                } else {
                    System.out.print("* ");
                }
            }
        }
        takeInput.close();
    }
}
