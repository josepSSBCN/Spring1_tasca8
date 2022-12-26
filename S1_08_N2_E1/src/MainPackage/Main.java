package MainPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        ArrayList<String> myStrings;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        myStrings = new ArrayList<>(Arrays.asList("Pau", "Arnau", "Ana", "Anna", "ali", "Ada", "Sandra",
                "Karl", "Eva", "axe", "Bob", "ian"));

        System.out.println(methodA3(myStrings));


        //endregion ACTIONS


        // OUT
        System.out.println("*** FINAL PROGRAMA***");

    }

    public static List<String> methodA3(ArrayList<String> inStrings) {
        return inStrings.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.length() == 3 && p.charAt(0) == 'A')
                .collect(Collectors.toList());
    }
}