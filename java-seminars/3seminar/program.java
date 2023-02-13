import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.*;
public class program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int index = 0; index < 10; index++) {
            list.add(rnd.nextInt(0,100));
            System.out.println(list);
        }
        list.sort(null);
        System.out.println(list);
    }
}
// import java.util.Comparator;

// public class SortRule implements Comparator<Integer>{

// @Override
// public int compare(Integer o1, Integer o2) {
// // if (o1 < o2) return 1;
// // else if (o1 > o2) return -1;
// // else return 0;
// return o1-o2;
// }
// }