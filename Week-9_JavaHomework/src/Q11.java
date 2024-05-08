import java.util.ArrayList;

public class Q11 {
    /*
       11. Declare global variables of your name, Add all your group names in list,
        using  for each loop iterate and print ONLY your name.
    */
    static String n="Minal";
    public static void main(String[] args) {
        groupName();
    }

    private static void groupName() {
        ArrayList<String> names=new ArrayList<>();
        names.add("Nirali");
        names.add("Dhaval");
        names.add("Minal");
        names.add("Shubham");
        names.add("Darshan");
        for (String name : names) {
            if (n.equals(name)) {
                System.out.println(name);
            }
        }

    }
}
