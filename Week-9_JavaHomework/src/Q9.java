import java.util.ArrayList;

public class Q9 {
    /*
        Write program and add all group names in to array and iterates through for  each loop.
     */
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
                System.out.println(name);
        }

    }
}
