import java.util.ArrayList;

/**
 * Created by patrick on 7/22/2017.
 */
public class ArrayListSorter {
    private SortMethod s;

    public ArrayListSorter() {
        //default sorting method
        s = new BubbleSort();
    }

    public void setSortMethod(SortMethod s) {
        //set new Sorting method
        this.s = s;
    }

    public void performSort(ArrayList<Integer> aList) {
        long start = System.currentTimeMillis();
        s.sort(aList);
        Long end = System.currentTimeMillis();
        System.out.println("Sort tijd " + s.getClass().toString() + " : " + (end - start) + " millis.");
       // printList(aList);
    }

    private void printList(ArrayList<Integer> aList) {
        for (int i : aList) {
            System.out.println("" + i);
        }

    }
}
