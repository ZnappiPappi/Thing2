package PastPapers;

public class BubbleSort {
    public static void main(String[] args) {
        int[] Numbers = {7, 2, 8, 1, 4, 6};
        int i = 1;
        while ( i < Numbers.length) {
            int j = 0;
            while ( j<= Numbers.length - 2) {
                if (Numbers[j] > Numbers[j + 1]) {
                    int temp = Numbers[j + 1];
                    Numbers[j + 1] = Numbers[j];
                    Numbers[j] = temp;
                }
                j++;
            }
            i++;
        }
        System.out.println(Numbers.length);

    }
}
