import java.util.LinkedList;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> randArr = RandomArr(list, 10);
        System.out.println("наш массив чисел : " + randArr);
        LinkedList<Integer> revarr = ReverseArr(randArr);

        System.out.println("наш развернутый массив : " + revarr);

    }
    public static LinkedList<Integer> ReverseArr( LinkedList<Integer> list) {
        LinkedList<Integer> reversList = new LinkedList<>();
         while(!list.isEmpty()){
            reversList.add(list.getLast());
            list.removeLast();
         }

        return reversList;
    }
    public static LinkedList<Integer> RandomArr( LinkedList<Integer> list, int length) {
        Random rnd = new Random();
        for (int index = 0; index < length; index++) {
            list.add(rnd.nextInt(0,100));
        }
        return list;
    }
}
