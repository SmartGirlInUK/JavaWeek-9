import java.util.ArrayList;

public class Q4 {
    /*
    4. Write a Java program to iterate through all elements in an array list using Iterator.
     */
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<>();
        a.add("Element-1");
        a.add("Element-2");
        a.add("Element-3");
        a.add("Element-4");
        a.add("Element-5");

        for (String str:a){
            System.out.println(str);
        }
    }
}
