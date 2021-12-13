package ListFiltering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainList {
    private static final Logger logger = LoggerFactory.getLogger(MainList.class);
    public static void arrayListFilter() {
        try {
            ArrayList<String> nameList = new ArrayList<>();
            nameList.add("Michael");
            nameList.add("Martin");
            nameList.add("Daniel");
            nameList.add("John");


            List<String> customersNameLengthFilter = nameList.stream()
                    .filter(a -> a.length() > 5).collect(Collectors.toList());

            System.out.println("longer then 5: ");
            customersNameLengthFilter.forEach(
                    (peopleNames) -> System.out.printf("Name is: %s,\n", peopleNames)
            );
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            logger.error("Error during run code", ex);
        }

    }
}
