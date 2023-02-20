import java.util.LinkedList;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введи строку типа \"text~num\" : ");
            String input = sc.nextLine();
            if(input.equals("stop")){
                System.out.println(list);
                break;
            }
            String[] parts = input.split("~");
            if(parts[0].equals("print")){
                int position =Integer.parseInt(parts[1]);
                System.out.println(list.get(position));
                list.remove(position);
                continue;
            }
            list.add(Integer.parseInt(parts[1]), parts[0]);
            System.out.println(list);

        }
    }
}
