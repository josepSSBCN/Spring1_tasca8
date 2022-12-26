package MainPackage;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        String myIntString;
        ////*List<Integer> intList = new ArrayList<>(Arrays.asList(1, 25, 4, 8, 45, 2124));
        int[] intList2 = {1, 1, 25, 25, 25, 75, 87, 158, 654, 25, 0, 14, 45, 975,
                214, 58752, 63, 55, 87, 123, 4, 751, 8, 45, 2124};


        //endregion DEFINITION VARIABLES


        //region ACTIONS
        myIntString = method(intList2);

        //endregion ACTIONS


        // OUT
        System.out.println(myIntString);


    }

    public static String method(int[] inIntList) {

        return Arrays.stream(inIntList)
                .filter(Objects::nonNull)
                .mapToObj(p-> (p%2==0)?"e"+p:"o"+p)
                .collect(Collectors.joining(", "));
    }


}


