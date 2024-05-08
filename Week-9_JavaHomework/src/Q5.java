import java.util.ArrayList;

public class Q5 {
    /*
    5. Write a Java program to test an array list is empty or not.
    Define array list with underground tube names
     */
    public static void main(String[] args) {
        ArrayList<String>tubeNames=new ArrayList<>();
        tubeNames.add("Victoria");
        tubeNames.add("Circle");
        tubeNames.add("District");
        tubeNames.add("Jubilee");
        tubeNames.add("Piccadilly");

        if (!tubeNames.isEmpty())
            for (String str : tubeNames) {
            System.out.println(str + " Line");
        }
    }
}
