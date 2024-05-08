import java.util.HashMap;
import java.util.Objects;

public class Q7 {
    /*
    7. Create a HashMap object called people that will store String keys and Integer values:
    And use for each loop to iterate the value from Map.
     */
    public static void main(String[] args) {
        HashMap<String,Integer>People=new HashMap<>();
        People.put("One",123);
        People.put("Two",456);
        People.put("Three",647);
        People.put("Four",283);
        People.put("Five",945);
        /*for (String str:People.keySet()){
            System.out.println(str);
        }
        for (Integer a:People.values()){
            System.out.println(a);
        }*/
        for (Object o:People.entrySet())
        {
            System.out.println(o);
        }
    }
}
