import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class program3 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        List<Integer> randomArr = RandomArr(list, 3);
        System.out.println(randomArr);
        Integer minNum = Collections.min(randomArr);
        System.out.println("Min numbers : " + minNum);
        Integer maxNum = Collections.max(randomArr);
        System.out.println("Max numbers : " + maxNum);
        Double average = Average(randomArr);
        System.out.println("Average : " + average);

    }
    public static List<Integer> RandomArr( List<Integer> list, int length) {
        Random rnd = new Random();
        for (int index = 0; index < length; index++) {
            list.add(rnd.nextInt(0,100));
        }
        return list;
    }
    public static double Average( List<Integer> list) {
        int sum = 0;
        double result = 0;
        for (int index = 0; index < list.size(); index++) {
            sum = sum + list.get(index);
        }
        result = sum / list.size();
        return result;
    }





}
