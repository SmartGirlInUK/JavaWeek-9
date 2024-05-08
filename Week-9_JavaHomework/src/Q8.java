import java.util.ArrayList;

public class Q8 {
    /*
    8. Write the program that tell you which line pass through particular stations.
     Just use Zone 1 stations name. (Challenge)
     */
    public static void main(String[] args) {
        ArrayList<String> stationNames = new ArrayList<>();
        stationNames.add("Kensington");
        stationNames.add("Euston");
        stationNames.add("Vauxhall");
        stationNames.add("Elephant & Castle");
        stationNames.add("London Bridge");
        stationNames.add("Waterloo");

        for (String name:stationNames){
            System.out.println("Currant Station is "+name);
        }
    }
}
