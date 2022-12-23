package MainPackage;

import InterfacePackage.MyFunctionInterface;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        double myDouble;
        MyFunctionInterface myFI = (pi) -> pi;

        //endregion DEFINITION VARIABLES

        //region ACTIONS
        myDouble = myFI.getPiValue(3.1415);

        //endregion ACTIONS

        // OUT
        System.out.println(myDouble);


    }
}