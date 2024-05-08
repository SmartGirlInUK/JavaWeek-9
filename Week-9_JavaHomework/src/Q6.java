import java.util.HashSet;

public class Q6 {
    /*
    6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
    Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
     */
    public static void main(String[] args) {
        HashSet<Integer>num=new HashSet<>();
        num.add(4);
        num.add(20);
        num.add(7);
        num.add(11);
        num.add(8);

        for (int n:num){
            if (n>=1&&n<=10){
                System.out.println(n+" is between 1 and 10.");
            }
        }
    }
}
