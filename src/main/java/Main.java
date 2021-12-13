import ListFiltering.MainHashMap;
import ListFiltering.MainList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {

            MainList.arrayListFilter();

            MainHashMap.hashMapFilter();


            logger.debug("code run successfully");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            logger.error("Error during run code", ex);
        }
    }
}
