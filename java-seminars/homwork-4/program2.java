import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> randArr = RandomArr(list, 10);
        System.out.println("наш массив чисел :  \n" + randArr);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Функции введите номер метода:  \n 1: enqueue() - помещает элемент в конец очереди \n 2: dequeue() - возвращает первый элемент из очереди и удаляет его, \n 3: first() - возвращает первый элемент из очереди, не удаляя.\n stop - остановить " );
            String input = sc.nextLine();

            if(input.equals("stop")){
                System.out.println(list);
                break;
            }
            else if (input.equals("1")){
                System.out.println("Введи число!" );
                Integer elem = sc.nextInt();
                randArr.addLast(elem);
                System.out.println("массив: " + randArr);

                break;
            }
            else if (input.equals("2")){
                System.out.println("массив: " + randArr);

                System.out.println("Первый элемент : " + randArr.getFirst() );

                randArr.removeFirst();
                System.out.println("массив: " + randArr);

                break;
            }
            else if (input.equals("3")){
                System.out.println("массив: " + randArr);

                System.out.println("Первый элемент : " + randArr.getFirst() );



                break;
            }
        }
    }

    public static LinkedList<Integer> RandomArr( LinkedList<Integer> list, int length) {
        Random rnd = new Random();
        for (int index = 0; index < length; index++) {
            list.add(rnd.nextInt(0,100));
        }
        return list;
    }
}
