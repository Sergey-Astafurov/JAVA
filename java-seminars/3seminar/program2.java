import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Солнце", "Солнце", "Солнце", "Земля", "Марс", "Марс", "Марс", "Земля",
                "Земля");
        List<String> namePlanets = new ArrayList<>();
        List<Integer> countPlanets = new ArrayList<>();
        for (String planet : list) {
            if(!namePlanets.contains(planet)){
                namePlanets.add( planet);
                countPlanets.add(1);
            }
            else{
                int index = namePlanets.indexOf(planet);
                countPlanets.set(index, countPlanets.get(index)+1);
            }

        }
        for (int index = 0; index < namePlanets.size(); index++) {
            System.out.printf("%s - %d \n", namePlanets.get(index), countPlanets.get(index));
        }
    }
}
