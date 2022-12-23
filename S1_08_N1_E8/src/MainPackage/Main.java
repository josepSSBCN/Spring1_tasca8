package MainPackage;

import InterfacePackage.MyFunctionInterface;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        String myString = "Josep Salgado Salichs";
        MyFunctionInterface m;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        m = (String s) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.reverse();
            return sb.toString();
        };

        //endregion ACTIONS


        // OUT
        System.out.println(m.reverse(myString));


    }
}