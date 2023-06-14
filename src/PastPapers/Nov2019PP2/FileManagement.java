package PastPapers.Nov2019PP2;

import java.util.Iterator;
import java.util.LinkedList;

public class FileManagement {
    
    private Arrival[] inbound;
    private int last = -1;

    public static Arrival[] inbound = new Arrival[200];
    public static void main(String[] args) {
        // a) outline advantage of using a library
        // - We do not have to repliacte standard functionality
        // - Even if we want to using the library is probably better anyways becayuse they arer probably tested
        // - It only took me a quick google search and ten seconds to have a robust collection of Arrival (a object I created)
        LinkedList<Arrival> runway1 = new LinkedList<Arrival>();

    }
    
    public static LinkedList mergeLists(LinkedList<Arrival> r1, LinkedList<Arrival> r2) {
        Iterator<Arrival> iterator = r2.iterator();
        while(iterator.hasNext()) {
            Arrival current = iterator.next();
            r1.add(current);
        }
        return r1;
    }

    public static void showDelayed(String t) {
        for(int i = 0; i < inbound.length; i++) {
            Arrival arrival = inbound[i]; // revision / link to topic 4 array access
            // if arrival has not landed and arrival.getETA < t
            // then output the arrival
        }
    }
}
