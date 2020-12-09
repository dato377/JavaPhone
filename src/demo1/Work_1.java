package demo1;

import java.util.HashSet;


public class Work_1 {

    public static void main(String[] args) {
        HashSet<String> Names=new HashSet<>();
        Names.add("Dato");
        Names.add("Kuco");
        Names.add("Giorgi");
        Names.add("Nika");

        for (String x : Names ) {
            System.out.println(x);
        }
    }
}
