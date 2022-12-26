package Main;


import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Object> orderByFirstChar(List<Object> myList) {
        return myList.stream()
                .filter(Objects::nonNull)
                .filter(p->p.toString().length()>0)
                .sorted(Comparator.comparing(p -> ((p.toString().charAt(0) < 48 || p.toString().charAt(0) > 57)) ? p.toString().charAt(0) : 0))
                .collect(Collectors.toList());

    }


    public static List<Object> orderByEMin(List<Object> myList) {
        return myList.stream()
                .filter(Objects::nonNull)
                .filter(p->p.toString().length()>0)
                .sorted(Comparator.comparing(p -> p.getClass().equals(String.class)).reversed())
                .sorted(Comparator.comparing(p -> p.toString().contains("e")).reversed())
                .collect(Collectors.toList());

    }

    public static List<Object> modifyAminBy4(List<Object> myList) {
        return myList.stream()
                .filter(Objects::nonNull)
                .filter(p->p.toString().length()>0)
                .map(p -> (p.getClass().equals(String.class)) ? p.toString().replace("a", "4") : p)
                .collect(Collectors.toList());
    }

    public static List<Object> removeStrings(List<Object> myList) {
        return myList.stream()
                .filter(Objects::nonNull)
                .filter(p->p.toString().length()>0)
                .filter(p -> !p.getClass().equals(String.class))
                .collect(Collectors.toList());

    }

}