package PastPapers;
import helpers.Keyboard;
public class MysteryLoop {
    public static void main(String[] args) {
       int N = Keyboard.readInt();
        while ( N > 0 && N % 2 == 0 ) {
            N = N -2;
        }
        System.out.println(N);
     }
}
