import java.text.CollationElementIterator;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class program2 {

    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Иван");
        listOfNames.add("Петр");
        listOfNames.add("Антон");
        listOfNames.add("Петр");
        listOfNames.add("Иван");
        listOfNames.add("Антон");
        listOfNames.add("Олег");
        listOfNames.add("Петр");
        listOfNames.add("Антон");
        listOfNames.add("Антон");


        Map<String, Integer> repeatInfo = new HashMap<>();
        int count;
        for (int i = 0; i < listOfNames.size(); i++) {
            count = 1;
            if (!repeatInfo.containsKey(listOfNames.get(i))) {
                for (int j = 1 + i; j < listOfNames.size(); j++) {
                    if (listOfNames.get(j).equals(listOfNames.get(i))) {
                        count++;
                    }
                }
                repeatInfo.put(listOfNames.get(i), count);
            } else continue;
        }



        String value = "";
        value = repeatInfo.values().toString();//значения в Мар преобразуем в строку
        value = value.substring(1, value.length()-1);//убираем [ ]

        String[] arrForSort = new String[repeatInfo.size()];//массив повторений содержит кол-во в строках
        int[] arrForSortInt = new int[repeatInfo.size()];//массив будет содержать повторения в числах

        arrForSort = value.split(", ");//преобразуем строку в массив

        for (int i = 0; i < arrForSort.length; i++) {
            arrForSortInt[i] = Integer.parseInt(arrForSort[i]);//получаем массив значений типа Integer
        }
        Arrays.sort(arrForSortInt);//сортируем массив по возрастнанию

// Выводим на печать соответсвующие значению ключи
        for (int i = arrForSortInt.length - 1; i > -1; i--) {
            for (String k : repeatInfo.keySet()){
                if(repeatInfo.get(k).equals(arrForSortInt[i]))
                    System.out.println(k + " = " + Integer.toString(repeatInfo.get(k)));
            }
        }

    }
}
