package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol",
                "Agost", "Setembre", "Octubre", "Novembre", "Decembre"));

        myList.forEach(p -> System.out.println(p));
        
    }
}