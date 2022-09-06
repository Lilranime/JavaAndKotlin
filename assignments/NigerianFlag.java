public class NigerianFlag {
    public static void main(String[] args) {
        /*
         * 2D Array, you choose the rows and column
         * use print when not at the end of the row
         * E.g. 2D => arr[10][30]
         * 
         * arr.length (it gets the length or number of
         * elements in that array but references the first bracket it sees)
         * 
         * arr[].length (gets the lenght of the dimension represented by the
         * number of brackets before the .length function - 1)
         * 
         * In the innermost loop use print function
         * when index is not yet equal to the last index of your array
         * and println when index == last index of your array
         * 
         * ==========**********==========
         * ==========**********==========
         * ==========**********==========
         * ==========**********==========
         * ==========**********==========
         * ==========**********==========
         * ==========**********==========
         */

        int[][] flagArray = new int[10][30];

        for (int rowsindex = 0; rowsindex < flagArray.length; rowsindex++) {
            for (int columnindex = 0; columnindex < flagArray[rowsindex].length; columnindex++) {

                if (columnindex <= 9) {
                    if (columnindex == flagArray[rowsindex].length - 1) {
                        System.out.println("=");
                    } else {
                        System.out.print("= ");
                    }
                } else if (columnindex <= 19) {
                    if (columnindex == flagArray[rowsindex].length - 1) {
                        System.out.println("*");
                    } else {
                        System.out.print("* ");
                    }
                } else if (columnindex <= (flagArray[rowsindex].length - 1)) {
                    if (columnindex == flagArray[rowsindex].length - 1) {
                        System.out.println("=");
                    } else {
                        System.out.print("= ");
                    }
                }
            }

        }

    }
}
