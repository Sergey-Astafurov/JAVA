import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class program3 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        // list.add("cc");
        // list.add(1);
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(0,20));
            list.add("Cccc");

        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }

        }
        System.out.println(list);
    }
}
