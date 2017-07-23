import java.util.ArrayList;

/**
 * Created by patrick on 7/22/2017.
 */
public class BubbleSort implements SortMethod {

    @Override
    public void sort(ArrayList<Integer> list) {
        for (int outer = 0; outer < list.size() - 1; outer++) {
            for (int inner = outer + 1; inner < list.size(); inner++) {
                if (list.get(outer) > list.get(inner)) {
                    swap(list, outer, inner);
                }
            }
        }
    }

    private void swap(ArrayList<Integer> sortedList, int outer, int inner) {
        int temp = sortedList.get(inner);
        sortedList.set(inner, sortedList.get(outer));
        sortedList.set(outer, temp);
    }
}
