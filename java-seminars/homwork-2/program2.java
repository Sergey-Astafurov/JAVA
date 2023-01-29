import java.io.IOException;
import java.util.logging.*;

public class program2 {
    static Logger logger;
    public static void main(String[] args) throws IOException{

        // LOGER  BEGIN
        logger = Logger.getLogger(program2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        // LOGER END

        logger.info(" Привет, будет создан массив из 8 элементов рандомным образом");

        int[] array = CreateArr(8);
        logger.info("Массив рандомных чисел создан");
        logger.info("массив  рандомных чисел :" + ArrToString(array));
        int[] bubleSort = SortBuble(array);
        logger.info("Отсортированный массив чисел :" + ArrToString(bubleSort));


    }

    public static StringBuilder ArrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
            sb.append(" ");

        }

        return sb;

    }

    public static int[] CreateArr(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31));
        }
        return array;


    }

    public static int[] SortBuble(int[] array) {
        logger.info("Происходит сортировка массива...");

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    logger.info("Число : " + array[i] + " больше числа : " + array[i+1]  );
                    isSorted = false;

                    logger.info("В переменную Буфер копируется : " + array[i]);
                    buf = array[i];

                    logger.info("Число : " + array[i+1] + " присваивается " + array[i] );
                    array[i] = array[i + 1];


                    array[i + 1] = buf;
                    logger.info("число : " + array[i+1] + " меняется на " + buf);
                    logger.info( "Теперь 1 число такое : " + array[i] + " второе число такое :" + array[i+1]  );


                }
            }
        }
        return array;

    }
}
