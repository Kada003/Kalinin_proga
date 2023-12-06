package pr14;
import java.util.LinkedList;
public class pr14_2 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();

        countries.add("Germany");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");

        System.out.println("LinkedList:");
        for (String country : countries) {
            System.out.println(country);
            }
        }
    }


