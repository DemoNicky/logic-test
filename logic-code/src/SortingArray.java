import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArray {
    public static void main(String[] args) {
        Object[] arr = {12,9,30,"A","M",99,82,"J","N","B"};

        List<String> letter = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for (Object obj : arr){
            if (obj instanceof String){
                letter.add(obj.toString());
            }else {
                numbers.add((Integer) obj);
            }
        }

        Collections.sort(letter);
        Collections.sort(numbers);

        List<Object> combineList = new ArrayList<>();
        combineList.addAll(letter);
        combineList.addAll(numbers);

        System.out.println(combineList);

    }
}
