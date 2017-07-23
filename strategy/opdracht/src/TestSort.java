import java.util.ArrayList;
import java.util.Random;

/**
 * Created by patrick on 7/22/2017.
 */
public class TestSort {
    public static void main(String[] args) {
        ArrayListSorter s = new ArrayListSorter();
        s.setSortMethod(new CollectionsSort());
        s.performSort(TestSort.makeRandonList());

        s.setSortMethod(new BubbleSort());
        s.performSort(TestSort.makeRandonList());
    }

    private static ArrayList<Integer> makeRandonList() {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        int capacity = 1000;
        for (int i = 0; i<capacity; i++){
            aList.add(randomGenerator.nextInt(capacity));
        }
        return aList;
    }
}
