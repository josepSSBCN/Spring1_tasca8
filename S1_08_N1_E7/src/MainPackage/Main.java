package MainPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        List<Object> myList;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        myList = new ArrayList<>(Arrays.asList("Hola", 23, "com", 34, "et", 56, "trobes", 11, "?"));
        myList.sort(Comparator.comparing(t -> t.getClass().equals(String.class)).thenComparing(t -> t.toString().length()).reversed());

        //endregion ACTIONS


        // OUT
        myList.forEach(p -> System.out.println(p));


    }

}