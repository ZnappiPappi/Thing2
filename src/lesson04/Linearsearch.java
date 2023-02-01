package lesson04;

/**
 * 4.2.1 Describe the characteristics of standard 1D array algorithms
 * 4.3.11 Construct algorithms that use arrays and access methods
 */
public class Linearsearch {

    /**
     * 
     * @param numarr
     * @param target
     * @return
     */
    public static int search(int[] numarr, int target) {
        for (int i = 0; i < numarr.length; i++) {
            if (numarr[i] == target) {
                return i;
            }
        }
        // TODO: implement the following pseudocode
        // loop for index from 0 to numarr.length
        //    if target is equal to numarr[index] then
        //       return index
        //    end if
        // end loop
        return -1; // not found because -1 is not an index that exists
    }

    public static int search(String[] strarr, String target) {
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] search2D(int[][] numarr, int target) {
        int[] ij = {-1, -1};
        for (int i = 0; i < numarr.length; i++) {
            for (int j = 0; j < numarr.length; j++) {
                if (numarr[i][j] == target) {
                    ij[0]=i;
                    ij[1]=j;
                }
            }
        }
        return ij;
    }
}
