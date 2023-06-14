package helpers;

import java.util.Collection;
import java.util.Iterator;

public class CollectionHelper {
    /*
     * Practice the running total
     */
    public static int sum(Collection<Integer> col) {
        Integer sum = 0;
        // get the iterator from the collection
        Iterator<Integer> iterator = col.iterator();

        while(iterator.hasNext()) {
            Integer nextInt = iterator.next();
            sum = sum + nextInt;
        }

        return (int) sum;
    }

    /*
     * Practice the linear search
     */
    public static int findPositionOf(Collection<Integer> col, int target) {
        int position = -1;
        Iterator<Integer> iterator = col.iterator();
        
        while(iterator.hasNext()) {
            Integer nextInt = iterator.next();
            position++;
            if (nextInt == target) {
                return position;
            }
        }


        return -1; // if we reach here it means we did not find it 
    }
}
