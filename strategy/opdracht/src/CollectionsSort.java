import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by patrick on 7/22/2017.
 */
public class CollectionsSort implements SortMethod {
    @Override
    public void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
