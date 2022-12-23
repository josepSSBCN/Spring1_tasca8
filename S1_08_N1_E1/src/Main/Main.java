package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList("hola", "casa", "osu", "cama", "nas", "SONAR"));

        System.out.println(withoutO(myList));

    }

    public static List<String> withoutO(List<String> inLIst){
        inLIst.removeIf(p -> !p.contains("o") && !p.contains("O"));
        return inLIst;
    }
}