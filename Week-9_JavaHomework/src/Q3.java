import java.util.ArrayList;

public class Q3 {
    /*
     3. Write a Java program to create a new array list, add some colours(string)
     and printout the collection using for each loop.
     */
    public static void main(String[] args) {
        ArrayList<String> colors =new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Purple");

        for (String str: colors){
            System.out.println(str);
        }
    }
}
