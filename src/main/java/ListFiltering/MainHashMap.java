package ListFiltering;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MainHashMap {
    private static final Logger logger = LoggerFactory.getLogger(MainList.class);
    public static void hashMapFilter() {
        try{
            Map<String, Integer> animals = new HashMap<>();
            animals.put("Cat", 2);
            animals.put("Chicken", 1);
            animals.put("dog", 25);
            animals.put("Cow", 140);
            animals.put("Fish", 15);


            Map<String, Integer> largeSizeAnimals = animals.entrySet().stream()
                    .filter(MainHashMap::largeSizeAnimal)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            System.out.println('\n');
            System.out.println("Animal names and weight more then 20: ");
            largeSizeAnimals.forEach(
                    (key, value) -> System.out.printf("Name: %s, weight: %d, \n", key, value)
            );


        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            logger.error("Error during run code", ex);
        }



    }

    public static boolean largeSizeAnimal(Map.Entry<String, Integer> entry) {
        return entry.getValue() > 20;
    }
}
