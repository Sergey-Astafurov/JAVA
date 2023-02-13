import java.util.Arrays;

public class program {

    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);//Создаем копию массива
        int[] buffer2 = new int[sortArr.length]; // пустой массив такой же длинны что и заданный массив ( 0,0,0, ...)
        // Отсортированный массив
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }
    // создаем метод с аргументами ( копия массива, пустой масс, начальный индекс и конечный (длинна массива))
    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        //Если начальный индекс >= конечному (6-1) => 5
        if (startIndex >= endIndex - 1) {
            //возвращает копию массива
            return buffer1;
        }

        //уже отсортирован
        // переменная середины массива (0 + (6-0)/2)
        int middle = startIndex + (endIndex - startIndex) / 2;
        //Создаем массив1  где первая половина массива
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        //Создаем массив1  где вторая половина массива
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
        //слияние

        int index1 = startIndex;
        System.out.println((index1));

        int index2 = middle;
        System.out.println((index2));

        int destIndex = startIndex;
        System.out.println((destIndex));


        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }
}
