package MainPackage;

import FunctionalPackage.FuncInterOperacio;


public class Main {
    public static void main(String[] args) {

        System.out.printf("SUMA: 3,4 + 5 = %s%n", calcul((byte) 1,3.4f, 5f));
        System.out.printf("RESTA: 3,4 - 5 = %s%n", calcul((byte) 2,3.4f, 5));
        System.out.printf("MULTIPLICACIO: 3,4 * 5 = %s%n", calcul((byte) 3,3.4f, 5));
        System.out.printf("DIVISIO: 3,4 / 5 = %s%n", calcul((byte) 4,3.4f, 5));

    }

    public static float calcul(byte option, float aNum, float bNum){
        //region DEFINITION VARIABLES
        FuncInterOperacio myFuncInterOperacio = null;


        //endregion DEFINITION VARIABLES


        //region ACTIONS

        switch (option) {
            case 1 ->             // SUMA
                    myFuncInterOperacio = (a, b) -> a + b;
            case 2 ->             // RESTA
                    myFuncInterOperacio = (a, b) -> Float.valueOf(a) - Float.valueOf(b);
            case 3 ->             // MULTIPLICACIO
                    myFuncInterOperacio = (a, b) -> a * b;
            case 4 ->             // DIVISIO
                    myFuncInterOperacio = (a, b) -> a / b;
            default -> {
            }
        }

        //endregion ACTIONS


        // OUT
        return myFuncInterOperacio.operacio(aNum, bNum);
    }

}