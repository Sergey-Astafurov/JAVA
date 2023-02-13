import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program2 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        List<Integer> randomArr = RandomArr(list, 10);
        System.out.println(randomArr);
        List<Integer> result = RemovEvenNums(randomArr);
        System.out.println(result);
    }
    public static List<Integer> RandomArr( List<Integer> list, int length) {
        Random rnd = new Random();
        for (int index = 0; index < length; index++) {
            list.add(rnd.nextInt(0,100));
        }
        return list;
    }
    public static List<Integer> RemovEvenNums( List<Integer> list) {
        for (int index = 0; index < list.size(); index++) {

            if(list.get(index) % 2 == 0){
                list.remove(list.get(index));
                index--;
            }
        }
        return list;
    }



}
