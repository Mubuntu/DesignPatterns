import java.util.ArrayList;

/**
 * Created by patrick on 7/22/2017.
 */
public class QuickSort implements SortMethod{
    @Override
    public void sort(ArrayList<Integer> aList) {
        int pivot = aList.get(0);
//        int low = first

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        for(int i = 1; i<aList.size();i++){
            if (aList.get(i)<pivot){
                left.add(aList.get(i));
                System.out.println(left);
            }else {
                right.add(aList.get(i));
            }
        }
        return join(sort(left), sort(right), pivot);
    }

    private void join(void sort, void sort1, int pivot) {

    }
}
