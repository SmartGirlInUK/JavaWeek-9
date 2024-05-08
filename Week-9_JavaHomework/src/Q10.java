import java.util.ArrayList;

public class Q10 {
    /*
       10. Write program and add all group members names in to array
       and iterates  through for each loop and print your name.
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
            if (name.equals("Minal")) {
                System.out.println(name);
            }
        }

    }

}
