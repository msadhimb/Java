import java.util.Map;
import java.util.TreeMap;

public class TokohTeknologiDemo {
    public static void main(String[]args) {
        Map<String, String> tTech = new TreeMap<String, String>();

        System.out.println("\n");
        tTech.put("Microsoft", "Bill Gates");
        tTech.put("Apple", "Steven Paul Jobs");
        tTech.put("Linux", "Linux Bennedict Torvalds");
        tTech.put("Facebook", "Mark Zuckerberg");
        tTech.put("Twitter", "Jack Dorsey");
        tTech.put("Instagram", "Kevin Systrom");
        
        int j = 1;
        for(String i: tTech.keySet()){
            System.out.println(j + ". " + i.toUpperCase() + " dikemabangkan oleh " + tTech.get(i));
            j++;
        }
        System.out.println("\n");
    }
}
