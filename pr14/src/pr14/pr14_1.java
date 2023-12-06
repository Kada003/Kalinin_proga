package pr14;
import java.util.ArrayList;

public class pr14_1 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        countries.add("Germany");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");

        System.out.println("ArrayList:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}

